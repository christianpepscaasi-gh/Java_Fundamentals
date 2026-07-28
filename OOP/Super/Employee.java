public class Employee extends Person{
    int salaray;

    Employee(String first, String last, int salary){
        super(first, last);
        this.salaray = salary;
    }

    void showSalary(){
        System.out.println(this.first+" "+this.last+" Salary is: "+this.salaray);
    }
}