class Constru{
    Constru(int a){
        System.out.println("HIIII :D");
        System.out.println(a);
    }
    Constru(int a, int b){
        System.out.println("Constructor Overloading");
        System.out.println("The value of A:"+a);
        System.out.println("The value of B:"+b);                       
    }
    public static void main(String args[]){
        Constru c = new Constru(10);
        Constru d = new Constru(10,20);
    }
}
