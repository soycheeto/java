// Creating a package (Packages)
package mypackage;

// Importing a package (Importing packages)
import java.util.*;

// Abstract class (Abstract class)
abstract class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    abstract void makeSound(); // Abstract method
}

// Interface (Interfaces)
interface Pet {
    void showAffection();
}

// Implementing interface (Implementing)
class Dog extends Animal implements Pet { // Inheritance
    
    Dog(String name) {
        super(name); // Super keyword
    }
    
    // Overriding (Overriding)
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
    
    // Implementing interface method
    @Override
    public void showAffection() {
        System.out.println(name + " wags its tail!");
    }
    
    // Method Overloading
    void play() {
        System.out.println(name + " is playing!");
    }
    
    void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }
}

// Final class (Final methods and classes)
final class Constants {
    public static final double PI = 3.14159;
}

// Custom Exception (Creating custom exceptions)
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Multithreading (Multithreaded programming)
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Synchronization (Synchronization)
class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " prints: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Exception Handling (Exception Handling Fundamentals)
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }
        
        // Custom Exception Handling
        try {
            throw new CustomException("This is a custom exception!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        
        // Creating and using an object
        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); // Polymorphism
        myDog.showAffection();
        myDog.play();
        myDog.play("ball");
        
        // Multithreading
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
        
        // Synchronization
        SharedResource resource = new SharedResource();
        Thread thread1 = new Thread(() -> resource.printNumbers(), "Thread1");
        Thread thread2 = new Thread(() -> resource.printNumbers(), "Thread2");
        thread1.start();
        thread2.start();
        
        // Type Wrappers (Type Wrappers)
        Integer wrappedInt = Integer.valueOf(10);
        Double wrappedDouble = Double.valueOf(3.14);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
    }
}
