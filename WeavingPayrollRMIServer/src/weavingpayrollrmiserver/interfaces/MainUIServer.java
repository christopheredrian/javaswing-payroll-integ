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

    /**
     * Returns a HashMap of Employees
     *
     * @return
     * @throws RemoteException
     */
    public HashMap<String, Employee> getEmployees() throws RemoteException;

    /**
     * Dual purpose method for adding and editing employees
     *
     * @param emp
     * @throws RemoteException
     */
    public void addEditEmployee(Employee emp) throws RemoteException;

    /**
     * Authenticates user
     *
     * @param password
     * @return
     * @throws RemoteException
     */
    public boolean authenticate(String password) throws RemoteException;

    /**
     * Clocks in a user
     *
     * @param id
     * @return
     * @throws RemoteException
     */
    public boolean clockIn(String id) throws RemoteException;

    /**
     * Clocks out a user
     *
     * @param id
     * @return
     * @throws RemoteException
     */
    public boolean clockOut(String id) throws RemoteException;

}
