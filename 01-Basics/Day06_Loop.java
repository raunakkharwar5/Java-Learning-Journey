public class Day06_Loop {
    public static void main(String[] args) {
        // Part 1: 1 to 10
        System.out.println("1 to 10:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n10 to 1 reverse:");
        // Part 2: 10 to 1 reverse
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("\nEven numbers:");
        // Part 3: Even numbers
        for(int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("\n--- Day 6 Done ---");
    }
}