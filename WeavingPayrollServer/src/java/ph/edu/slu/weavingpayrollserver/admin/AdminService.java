/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.slu.weavingpayrollserver.admin;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chris
 */
@WebService(serviceName = "AdminService")
public class AdminService {

    private static final String PASSWORD = "password";

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     *
     * @param enteredPassword
     * @return
     */
    @WebMethod(operationName = "activateAdmin")
    public boolean activateAdmin(@WebParam(name = "enteredPassword") String enteredPassword) {
        return enteredPassword.equals(PASSWORD);
    }
}
