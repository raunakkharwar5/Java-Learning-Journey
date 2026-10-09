import java.util.Scanner;

public class Day07_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Raunak's While Loop - Gym Reps");

        // Task 1: Simple While Loop
        System.out.println("\nTask 1: 1 to 5 using while");
        int i = 1;
        while(i <= 5) {
            System.out.println("Rep " + i);
            i++;
        }

        // Task 2: Gym logic - jab tak energy hai tab tak workout
        System.out.println("\nTask 2: Workout till failure");
        int energy = 100;
        while(energy > 0) {
            System.out.println("Workout kar raha hu... Energy: " + energy);
            energy = energy - 20; // har set me 20 energy kam
        }
        System.out.println("Energy khatam! Workout done 💪");

        // Task 3: User se input - sahi input aane tak puchte raho
        System.out.println("\nTask 3: Enter number > 10");
        int num = 0;
        while(num <= 10) {
            System.out.print("Number daal (10 se bada): ");
            num = sc.nextInt();
        }
        System.out.println("Sahi hai! Tune " + num + " dala jo 10 se bada hai.");

        sc.close();
    }
}