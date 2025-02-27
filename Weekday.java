/*write a program that takes the number form the user and generates an integer between 1 to 7 and display the name of weekdays (use switch case)*/
import java.util.Scanner;

class Weekday {
    public int dayI() {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        return d;
    }

    public void dayO(int d) {
        switch (d) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect input; Enter a number from 1-7");
        }
    }

    public static void main(String[] args) {
        Weekday wk = new Weekday();
        System.out.println("Enter a number (1-7):");
        int d = wk.dayI();
        wk.dayO(d);
    }
}
