//Write a Java program that uses inheritance and interfaces to create a hierarchy of classes  and implement a common interface. 

interface A{
    public void CelsiusToFahrenheit(double t);
}

class B{
    public void FahrenheitToCelsius(double t){
        System.out.println((t-32)/1.8);
    }
}

class C extends B implements A{
    public void CelsiusToFahrenheit(double t){
        System.out.println((t*1.8)+32);
    }

    public static void main(String[] args){
        C obj = new C();
        obj.CelsiusToFahrenheit(100);
        obj.FahrenheitToCelsius(212);
    }
}