import java.util.Scanner;

class Employee {

    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    public void inputdetails() {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        emp_name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic_salary = sc.nextDouble();


        sc.close();


        calculateGrossSalary();
    }


    public void calculateGrossSalary() {

        double pf = basic_salary * 0.08;   // 8% of basic salary as PF


        gross_salary = basic_salary - pf;
    }


    public void displayDetails() {
        System.out.println("\nemployee Details ->");
         System.out.println("employee id is " + emp_id);
        System.out.println("employee name is " + emp_name);
           System.out.println("basic salary: " + basic_salary);
        System.out.println("gross salary: " + gross_salary);
    }
}

public class assg2_que14 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.inputdetails();
        employee.displayDetails();
    }
}
