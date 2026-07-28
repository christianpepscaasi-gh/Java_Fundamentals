public class Run {
    public static void main(String[] args) {
        Person person = new Person("Christian", "Caasi");
        Student student = new Student("Christian", "Caasi", 2.4);
        Employee employee = new Employee("Christian", "Caasi", 100);

        person.showName();
        student.showGpa();
        employee.showSalary();
    }
}