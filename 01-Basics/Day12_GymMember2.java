public class Day12_GymMember2 {
    String name;
    int age;
    double fees;

    // Ye hai Constructor, class ke naam jaisa hi hota hai
    Day12_GymMember2(String name, int age, double fees) {
        this.name = name;
        this.age = age;
        this.fees = fees;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Fees: " + fees);
    }

    public static void main(String[] args) {
        Day12_GymMember2 m1 = new Day12_GymMember2("Raunak", 24, 1500);
        Day12_GymMember2 m2 = new Day12_GymMember2("Sudi", 20, 2000);

        m1.show();
        System.out.println("-----");
        m2.show();
    }
}