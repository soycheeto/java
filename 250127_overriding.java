//Method Overriding
//https://www.geeksforgeeks.org/overriding-in-java/
class A{
    public void start(){
        System.out.print("Over");
    }
}

class B extends A{
    @ Override
    public void start(){
        System.out.print("Ride")
    }
}

method(){
    B b=new B();
    b.start();
    A a=new A();
    a.start();
}