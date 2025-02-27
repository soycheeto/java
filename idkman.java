/*implement hybrid inheritance*/

class A{
    String a = "3.141592653589793238466";
    String b= "2.718281828";
    String c="6.62607004 x 10^-34"
    void displayA("Pi: " + a);
}

class B extends A{
    void displayB("Euler's number: "+ super.b);
    void displayF("GR No.:"+ 35117);
}

class C{
    float g = 9.81
}

class D extends B, C{
    void displayC("Gravity on Earth: " + super.g + "ms^-2");

}