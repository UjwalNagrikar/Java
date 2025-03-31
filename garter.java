import java.util.*;
public class garter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1st number :");
        int number1 = sc.nextInt();

        System.out.println("enter second number :");
        int number2 = sc.nextInt();

        if (number1 == number2) {
            System.out.println("equall number ");
        }else{
            if (number1 > number2) {
                System.out.println("number 1 is grater ");
            }
            else{
                System.out.println("number 2 is leaser");
            }
        }
    }
}