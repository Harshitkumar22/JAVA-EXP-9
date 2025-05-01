import java.util.ArrayList;

class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary){   // Constructor
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display(){       // To display employee info
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: Rs" + salary);
    }
}

public class EmployeeList{
        public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>(); // Create ArrayList to store Employee objects

        employees.add(new Employee("Harshit", 101, 55000));
        employees.add(new Employee("Dhairya", 102, 60000));
        employees.add(new Employee("Daksh", 103, 55000));

        // Update salary of employee with id 102
        for(Employee emp : employees){
            if(emp.id == 102){
                emp.salary = 55000;
                System.out.println("Updated salary of " + emp.name + " is "+ emp.salary);
            }
        }

        // Remove employee with id 101
        employees.removeIf(emp -> emp.id == 101);

       // Print remaining employees
        System.out.println("\nRemaining Employees:");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}