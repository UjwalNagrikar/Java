import java.util.*;
public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition   1");
        System.out.println("Subraction 2");
        System.out.println("Multiply   3");
        System.out.println("Division   4");

       
        System.out.println("enter you chice :");
        int UserInput = sc.nextInt();

        if (UserInput == 1) {
            System.out.println("Enter 1st number :");
            int num1 = sc.nextInt();

            System.out.println("Enter second number :");
            int num2 = sc.nextInt();

            int sum = num1 + num2 ;

            System.out.println("Addition is " + sum);
        }
        if (UserInput == 2) {
            System.out.println("Enter 1st number :");
            int num1 = sc.nextInt();

            System.out.println("Enter second number :");
            int num2 = sc.nextInt();

            int sub = num1 - num2 ;

            System.out.println("Subraction  is " + sub);
        }
        if (UserInput == 3) {
            System.out.println("Enter 1st number :");
            int num1 = sc.nextInt();

            System.out.println("Enter second number :");
            int num2 = sc.nextInt();

            int mul = num1 * num2 ;

            System.out.println("Multiply is " + mul);
        }
        if (UserInput == 4 ) {
            System.out.println("Enter 1st number :");
            int num1 = sc.nextInt();

            System.out.println("Enter second number :");
            int num2 = sc.nextInt();

            int div = num1 / num2 ;

            System.out.println("Division is " + div);
        }
        sc.close();
    }
}
