/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.slu.weavingpayrollserver.employees;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.jws.WebService;
import javax.jws.WebMethod;
import ph.edu.slu.weavingpayrollserver.model.Employee;

/**
 *
 * @author chris
 */
@WebService(serviceName = "EmployeeService")
public class EmployeeService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello() {
        //TODO write your implementation code here:
        return "hell";
    }

    private static List<Employee> employees = new LinkedList<>();

    /**
     *
     */
    public EmployeeService() {
        employees.add(new Employee("1", "Christopher", "Espiritu"));
        employees.add(new Employee("2", "Jose Mari", "Malong"));
        employees.add(new Employee("3", "Roi", "Padilla"));
        employees.add(new Employee("4", "Melkee", "Rabbot"));
        employees.add(new Employee("5", "Steven", "Tomines"));
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "getAllEmployees")
    public java.util.List<Employee> getAllEmployees() {
        return employees;
    }
}
