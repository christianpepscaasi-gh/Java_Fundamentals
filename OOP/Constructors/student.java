public class student{

    String name;
    int age;
    double grade;
    boolean isEnrolled;

    Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.isEnrolled = true;
    }

    void isStudying(){
        System.out.printf("Student %s is studying\n", name);
    }

}