package employee;

public class Main {

    public static void main(String[] args) {

        EmployeeManagementSystem emp = new EmployeeManagementSystem(10);

        emp.addEmployee(new Employee(101, "Rohith", "Developer", 50000));
        emp.addEmployee(new Employee(102, "Rahul", "Tester", 40000));
        emp.addEmployee(new Employee(103, "Akhil", "Manager", 70000));

        System.out.println("\n===== Employee List =====");
        emp.displayEmployees();

        System.out.println("\n===== Search Employee =====");
        emp.searchEmployee(102);

        System.out.println("\n===== Delete Employee =====");
        emp.deleteEmployee(102);

        System.out.println("\n===== Employee List After Delete =====");
        emp.displayEmployees();
    }
}
