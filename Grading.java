import java.util.*;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("grade is a ");
        }else if (marks >=80) {
            System.out.println("b grade");
        }else if (marks >= 70) {
            System.out.println("c garde ");
        }else if (marks >= 60) {
            System.out.println("d grade ");
        }else if (marks >= 0) {
            System.out.println("fail");
        }
    }
}
