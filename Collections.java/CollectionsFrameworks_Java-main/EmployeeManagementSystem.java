import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", Salary=" + salary +
                '}';
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Set<Employee> employeeSet = new HashSet<>();
        Map<Integer, Employee> employeeMap = new HashMap<>();

        
        Employee emp1 = new Employee(101, "Alice", "HR", 50000);
        Employee emp2 = new Employee(102, "Bob", "IT", 70000);
        Employee emp3 = new Employee(103, "Charlie", "Finance", 60000);
        Employee emp4 = new Employee(104, "David", "IT", 65000);

        employeeList.addAll(Arrays.asList(emp1, emp2, emp3, emp4));
        employeeSet.addAll(Arrays.asList(emp1, emp2, emp3, emp4));
        employeeMap.put(emp1.getId(), emp1);
        employeeMap.put(emp2.getId(), emp2);
        employeeMap.put(emp3.getId(), emp3);
        employeeMap.put(emp4.getId(), emp4);

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        
        employeeList.sort(new SalaryComparator());
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        
        System.out.println("\nEmployees in Set:");
        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }

        
        System.out.println("\nEmployees in Map:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}
