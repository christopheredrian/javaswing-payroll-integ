/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.slu.weavingpayrollserver.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import ph.edu.slu.weavingpayrollserver.controllers.EmployeeController;
import ph.edu.slu.weavingpayrollserver.model.Employee;

/**
 *
 * @author chris
 */
@WebService(serviceName = "MainService")
public class MainService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "timeIn")
    public Boolean timeIn(@WebParam(name = "id") String id) {
        return EmployeeController.timeIn(id);
    }
    
    
}
