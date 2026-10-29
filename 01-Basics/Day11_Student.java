public class Day11_Student {
    String name;
    int rollNo;

    // Constructor
    Day11_Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Day11_Student s1 = new Day11_Student("Raunak", 101);
        Day11_Student s2 = new Day11_Student("Sudi", 102);

        s1.display();
        s2.display();
    }
}