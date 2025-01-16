// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class GreatestOfThree{
    class Main {
        public static void main(String[] args) {
            System.out.println("Greatest of 3");
            
            Scanner a = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter 1st number:\n");
            int n1 = a.nextInt();
            
            Scanner b = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter 2nd number:\n");
            int n2 = b.nextInt();
            
            Scanner c = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter 3rd number:\n");
            int n3 = c.nextInt();
            
            if (n1>=n2){
                System.out.printf("%d is the greatest.", n1);
            }
            else if (n2>=n3){
                System.out.printf("%d is the greatest.", n2);
            }
            
            else{
                System.out.printf("%d is the greatest.", n3)
                ;
            }
        }
    }
}
