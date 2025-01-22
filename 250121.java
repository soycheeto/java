class A{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        if(b == 0){
            return "Division by zero is not possible";
        }
        return a/b;
    }
    public void print(){
        System.out.println("Hello World");
    }
    public static void main(string[]args){
        A rv = new A();
        int result = rv.add(10,20);
        System.out.println("Result: "+result);
    }
}

//create separate file to actually use B since there are two main methods in the same file. I am lazy.
class B extends A{ //single level inheritance
    public static void main(string[]args){
        B b = new B();
        b.print();
    }
}

//multilevel inheritance
class C extends B{
    public static void main(string[]args){
        C c = new C();
        c.print();
    }
}

//hierarchical inheritance
class A{

}
class B extends A{

}

class C extends A{
    
}

//hybrid inheritance
class A{

}
class B extends A{

} 
class C extends B{

}
class D extends B{

}