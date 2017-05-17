/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weavingpayrollrmiserver.controllers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import weavingpayrollrmiserver.models.Employee;
import weavingpayrollrmiserver.interfaces.MainUIServer;

/**
 *
 * @author chris
 */
public class MainUIServerImp extends UnicastRemoteObject implements MainUIServer {

    private static HashMap<String, Employee> employees = new HashMap<>();

    public MainUIServerImp() throws RemoteException {
        Employee cee = new Employee("1", "Christopher", "Espiritu", "1");
        cee.setBirthday(LocalDate.of(1995, Month.JUNE, 5));
        cee.setHireDate(LocalDate.of(2016, Month.JULY, 23));

        employees.put("1", cee);
        employees.put("2", new Employee("2", "Jose Mari", "Malong", "2"));
        employees.put("3", new Employee("3", "Roi", "Padilla", "3"));
        employees.put("4", new Employee("4", "Melkee", "Rabbot", "4"));
        employees.put("5", new Employee("5", "Steven", "Tomines", "5"));
    }

    public static boolean timeIn(String id) {
        return employees.get(id).timeIn();
    }

    @Override
    public HashMap<String, Employee> getEmployees() throws RemoteException {
        return employees;
    }

    @Override
    public boolean authenticate(String password) throws RemoteException {
        return password.equals("password");
    }

    @Override
    public void addEditEmployee(Employee emp) throws RemoteException {
        employees.put(emp.getId(), emp);
    }

}
