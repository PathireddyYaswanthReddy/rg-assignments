public class Main {
    public static void main(String[] args) {
        EmployeeCRUD crud = new EmployeeCRUD();

        crud.addEmployee(new Employee(1, "Yaswanth", "IT"));
        crud.addEmployee(new Employee(2, "Arun", "HR"));

        System.out.println("All Employees:");
        crud.viewEmployees();

        crud.updateEmployee(2, "John", "Finance");

        crud.deleteEmployee(1);

        System.out.println("\nAfter Update & Delete:");
        crud.viewEmployees();
    }
}
