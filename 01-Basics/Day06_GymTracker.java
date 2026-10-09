import java.util.Scanner;

public class Day06_GymTracker {

    public static void printSet(int setNumber) {
        System.out.println("Set " + setNumber + " done 💪");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Raunak's Gym Tracker - Day 6");

        System.out.print("Aaj kitne sets karne hain? ");
        int totalSets = sc.nextInt();

        for (int i = 1; i <= totalSets; i++) {
            printSet(i);
        }

        System.out.println("Workout Complete! " + totalSets + " sets done 🔥");
        sc.close();
    }
}