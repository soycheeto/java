//A Super keyword

class A{ //parent
    String name= "Hi";

}

class B extends A{ //Super keyword used to inherit attributes from parent class
    public void display(){
        String name = "World";
        System.out.print(name);
        System.out.print(Super.name)

    }
}