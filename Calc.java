import java.util.Scanner;
class Calc{
    public int numInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        return num;
    }

    public String operatorInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter + for addition, - for subtraction, * for multiplication, / for division and % for modulus: ");
        String operator = sc.next();
        return operator;
    }

    public static void main(String[] args){
        Calc obj = new Calc();
        int num1 = obj.numInput();
        int num2 = obj.numInput();
        String operator = obj.operatorInput();
        int result = 0;
        switch(operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("The result is: " + result);
    }
}