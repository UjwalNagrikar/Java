import java.util.*;

public class input {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter you name :");
        String name = sc.nextLine();

        System.out.println(" name is :" + name);
        
        System.out.println("Enter your age :");
        int age = sc.nextInt();

        System.out.println("Your age is " + age);
    }
}