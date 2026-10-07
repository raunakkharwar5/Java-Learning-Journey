import java.util.Scanner;

public class Day04_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You can Vote! You are " + age + " years old.");
        } else {
            System.out.println("You cannot Vote. Wait for " + (18 - age) + " years.");
        }

        System.out.print("\nEnter a number to check Even/Odd: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}