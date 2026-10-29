public class Day11_GymMember {
    String name;
    String plan;
    int months;

    Day11_GymMember(String n, String p, int m) {
        name = n;
        plan = p;
        months = m;
    }

    int calculateFee() {
        int perMonth = 0;
        if (plan.equals("Basic")) {
            perMonth = 1000;
        } else if (plan.equals("Pro")) {
            perMonth = 2000;
        }
        return perMonth * months;
    }

    void display() {
        System.out.println(name + " | " + plan + " | Fee: " + calculateFee());
    }

    public static void main(String[] args) {
        Day11_GymMember m1 = new Day11_GymMember("Raunak", "Pro", 3);
        Day11_GymMember m2 = new Day11_GymMember("Sudi", "Basic", 3);

        m1.display();
        m2.display();
    }
}