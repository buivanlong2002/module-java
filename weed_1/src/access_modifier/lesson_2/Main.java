package access_modifier.lesson_2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Alice");
        s1.setClasses("C05");

        System.out.println(s1.getInfo());
    }
}
