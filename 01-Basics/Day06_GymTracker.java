public class Day06_GymTracker {

    // Ye method hai - baar baar use kar sakte hain
    public static void printSet(int setNumber) {
        System.out.println("Set " + setNumber + " done 💪");
    }

    public static void main(String[] args) {
        System.out.println("Raunak's Gym Tracker - Day 6");

        // For loop - 4 sets
        for (int i = 1; i <= 4; i++) {
            printSet(i);
        }

        System.out.println("Workout Complete!");
    }
}