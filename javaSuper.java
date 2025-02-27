//Write a java program to show the use of super keyword to call constructor, method and a variable.

class P {
    int pvar = 3;

    P() {
        System.out.println("Parent class constructor");
    }

    void pMethod() {
        System.out.println("Parent class method");
    }
}

class S extends P {
    S() {
        super(); // Calls the parent class constructor
        System.out.println("Parent class variable: " + super.pvar);
        System.out.println("Child class variable");
        System.out.println("Child class constructor");
    }

    void sMethod() {
        super.pMethod(); // Calls the parent class method
        System.out.println("Child class method");
    }
}

class Main {
    public static void main(String[] args) {
        S obj = new S(); // Creating an object of child class
        obj.sMethod();   // Calling child class method
    }
}
