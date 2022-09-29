package top.horon.oop.demo05;

public class Student {
    private static int age;
    private double score;

    public void run(){

    }

    private static void go(){

    }

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(Student.age);
        System.out.println(s1.age);
        System.out.println(s1.score);

        new Student().run();
        Student.go();//Student也可以不要
    }
}
