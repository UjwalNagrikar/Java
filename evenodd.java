import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your any number :");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}