class Main{
    public static void checkBalance(int balance){
        if(balance<1000){
            throw new ArithmeticException("Insufficient account balance. You must maintain an account balance of at least INR 1000.");
        }
        else{
            System.out.println("Sufficient account balance.");
        }
    }
    public static void main(String[] args){
        checkBalance(12);
    }
}