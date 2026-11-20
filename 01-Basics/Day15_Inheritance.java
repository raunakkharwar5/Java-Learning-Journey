public class Day15_Inheritance {

    static class Person {
        String name = "Raunak";
        void eat() {
            System.out.println(name + " khana kha raha hai");
        }
    }

    // Beta wali Class - Person ki saari cheez le li
    static class Student extends Person {
        void study() {
            System.out.println(name + " padhai kar raha hai");
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.eat();
        s.study();
    }
}