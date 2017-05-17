/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.slu.weavingpayrollserver.controllers;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import ph.edu.slu.weavingpayrollserver.model.Employee;

/**
 *
 * @author chris
 */
@WebService(serviceName = "EmployeeService")
public class EmployeeService {

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello() {
        //TODO write your implementation code here:
        return "helooo";
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "getAllEmployees")
    public java.util.List<Employee> getAllEmployees() {
        return EmployeeController.getEmployees();
    }

    /**
     * Web service operation
     *
     * @return
     */
    @WebMethod(operationName = "timeIn")
    public java.lang.String timeIn() {
        return "hello";
    }

}
