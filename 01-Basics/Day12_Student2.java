public class Day12_Student2 {
    String name;
    int rollNo;
    int marks;

    Day12_Student2(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Day12_Student2 s1 = new Day12_Student2("Raunak", 101, 85);
        Day12_Student2 s2 = new Day12_Student2("Sudi", 102, 90);

        s1.show();
        System.out.println("-----");
        s2.show();
    }
}