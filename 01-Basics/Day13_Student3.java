public class Day13_Student3 {
    String name;
    int rollNo;
    double marks;

    Day13_Student3(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void show() {
        System.out.println("Name: " + name + " | Roll: " + rollNo + " | Marks: " + marks);
    }

    public static void main(String[] args) {
        Day13_Student3 s1 = new Day13_Student3("Raunak", 1, 88.5);
        s1.show();
    }
}