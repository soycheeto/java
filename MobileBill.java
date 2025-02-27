/*
 find the following call rates for mobile users:
    local call: 10 paisa per call
    isd call: rs 1 per call
    net package cost: 1 gb rs 500
    calculate and produce mobile bill for customers. use constructor overloading such as default and argument constructor
*/

class MobileBill {
    private int localCalls;
    private int isdCalls;
    private int dataGB;
    private double totalBill;
    public MobileBill() {
        this.localCalls = 0;
        this.isdCalls = 0;
        this.dataGB = 0;
        calculateBill();
    }
    public MobileBill(int localCalls, int isdCalls, int dataGB) {
        this.localCalls = localCalls;
        this.isdCalls = isdCalls;
        this.dataGB = dataGB;
        calculateBill();
    }
    private void calculateBill() {
        double localCallCost = localCalls * 0.10; 
        double isdCallCost = isdCalls * 1.00;    
        double netPackageCost = dataGB * 500;  

        totalBill = localCallCost + isdCallCost + netPackageCost;
    }
    public void displayBill() {
        System.out.println("Local Calls: " + localCalls + " (Cost: " + (localCalls * 0.10) + " Rs)");
        System.out.println("ISD Calls: " + isdCalls + " (Cost: " + (isdCalls * 1.00) + " Rs)");
        System.out.println("Internet Data: " + dataGB + " GB (Cost: " + (dataGB * 500) + " Rs)");
        System.out.println("Total Bill: Rs " + totalBill);
    }

    public static void main(String[] args) {
        // default
        MobileBill bill1 = new MobileBill();
        bill1.displayBill();
        System.out.println();
        // parameterized 
        MobileBill bill2 = new MobileBill(50, 5, 2); // 50 local calls, 5 ISD calls, 2GB data
        bill2.displayBill();
    }
}
