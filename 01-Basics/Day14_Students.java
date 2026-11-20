public class Day14_Students {
    String name;
    int rollNo;
    double marks;

    Day14_Students(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void show() {
        System.out.println("Name: " + name + " | Roll: " + rollNo + " | Marks: " + marks);
    }

    public static void main(String[] args) {
        Day14_Students[] students = new Day14_Students[3];
        students[0] = new Day14_Students("Raunak", 1, 88.5);
        students[1] = new Day14_Students("Sudi", 2, 92.0);
        students[2] = new Day14_Students("Dolly", 3, 75.5);

        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
    }
}