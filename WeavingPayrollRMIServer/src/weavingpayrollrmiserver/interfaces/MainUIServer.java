/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weavingpayrollrmiserver.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

import weavingpayrollrmiserver.models.Employee;

/**
 *
 * @author chris
 */
public interface MainUIServer extends Remote {

    public HashMap<String, Employee> getEmployees() throws RemoteException;

    public void addEditEmployee(Employee emp) throws RemoteException;

    public boolean authenticate(String password) throws RemoteException;

}
