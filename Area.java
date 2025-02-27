class Circle {
    public void area(int r) {
        System.out.println("Circle Area: " + (Math.PI * r * r));
    }
}

class Rectangle extends Circle {
    @Override
    public void area(int r) { 
        int width = 5; 
        System.out.println("Rectangle Area: " + (r * width));
    }
}

class Area {
    public static void main(String[] args) {
        Circle circleObj = new Circle();
        circleObj.area(2);  

        Circle rectObj = new Rectangle(); 
        rectObj.area(3); 
    }
}
