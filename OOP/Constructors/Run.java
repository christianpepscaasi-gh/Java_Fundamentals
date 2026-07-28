public class Run  {
    public static void main(String[] args) {
        Student student1 = new Student("Christian Peps", 22, 3.5);
        Student student2 = new Student("Tristan Andrew", 13, 3.5);
        Student student3 = new Student("Xia Ysabel", 8, 2.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.grade);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.grade);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.grade);
        System.out.println(student3.isEnrolled);

        student1.isStudying();
        student2.isStudying();
        student3.isStudying();
    }
}