//Q2.) Write a java program that implements method overloading and method overriding using a base class and a derived class.

class Base {
    void display() {
        System.out.println("Base class display method");
    }

    void overload(int a) {
        System.out.println(a);
    }

    void overload(int a, int b){
        System.out.println(a+b);
    }
}

class Derived extends Base {
    void display() {
        System.out.println("Derived class display method");
    }
}

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        b.display();
        b.overload(5);
        b.overload(5, 10);

        Derived d = new Derived();
        d.display();
    }
}