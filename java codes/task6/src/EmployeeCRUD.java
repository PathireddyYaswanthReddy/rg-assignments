import java.util.ArrayList;

public class EmployeeCRUD {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public boolean updateEmployee(int id, String newName, String newDept) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setDepartment(newDept);
                System.out.println("Employee updated successfully.");
                return true;
            }
        }
        System.out.println("Employee not found.");
        return false;
    }

    public boolean deleteEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employees.remove(emp);
                System.out.println("Employee deleted successfully.");
                return true;
            }
        }
        System.out.println("Employee not found.");
        return false;
    }
}
