/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.slu.weavingpayrollapp.controllers;

/**
 *
 * @author chris
 */
public class MainUIController {

    public static boolean activateAdmin(java.lang.String enteredPassword) {
        ph.edu.slu.weavingpayrollserver.admin.AdminService_Service service = new ph.edu.slu.weavingpayrollserver.admin.AdminService_Service();
        ph.edu.slu.weavingpayrollserver.admin.AdminService port = service.getAdminServicePort();
        return port.activateAdmin(enteredPassword);
    }

    public static java.util.List<ph.edu.slu.weavingpayrollserver.employees.Employee> getAllEmployees() {
        ph.edu.slu.weavingpayrollserver.employees.EmployeeService_Service service = new ph.edu.slu.weavingpayrollserver.employees.EmployeeService_Service();
        ph.edu.slu.weavingpayrollserver.employees.EmployeeService port = service.getEmployeeServicePort();
        return port.getAllEmployees();
    }

}
