package ph.edu.slu.weavingpayrollserver.controllers;

import java.util.LinkedList;
import java.util.List;
import ph.edu.slu.weavingpayrollserver.model.Employee;

/**
 *
 * @author chris
 */
public class EmployeeController {

    private static List<Employee> employees = new LinkedList<>();

    public static List<Employee> getEmployees() {
        return employees;
    }

    public static void setEmployees(List<Employee> employees) {
        EmployeeController.employees = employees;
    }

    static {
        employees.add(new Employee("1", "Christopher", "Espiritu", "1"));
        employees.add(new Employee("2", "Jose Mari", "Malong", "2"));
        employees.add(new Employee("3", "Roi", "Padilla", "3"));
        employees.add(new Employee("4", "Melkee", "Rabbot", "4"));
        employees.add(new Employee("5", "Steven", "Tomines", "5"));
    }

    public static boolean timeIn(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employee.timeIn();
                return true;
            }
        }
        return false;
    }

}
