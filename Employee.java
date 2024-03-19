public class Employee {

    String emp_name;
    int emp_id;
    float salary;
    public Employee(String name, int emp_id , float salary){
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("Employee name" +emp_name);
        System.out.println("Employee ID" +emp_id);
        System.out.println("Salary of Employee" +salary);
    }
}
