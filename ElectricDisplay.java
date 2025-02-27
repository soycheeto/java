/*Create a Java program that demonstrates the following concepts: with:
A variable maxSpeed set to 200.
A method start().
A method stop().
that and adds: (When an interface inherits from another interface it uses keyword : extends)
A method chargeBattery().
that and provides implementations for all the methods.In the main method, create an instance of the Tesla class and call all the implemented methods. Also, print the maxSpeed from the interface. */

interface Electric{
    public void start();
    public void stop();
    final int maxSpeed=200;
}

class Tesla implements Electric{
    public void start(){
        System.out.println("Now starting.");
    }
    public void stop(){
        System.out.println("Stopping the car.");
    }
    public void chargeBattery(){
        System.out.println("Battery charging.");
    }
}

class ElectricDisplay{
    public static void main(String[] args){
        Tesla car = new Tesla();
        car.start();
        car.chargeBattery();
        car.stop();
        System.out.println(car.maxSpeed);
    }
}