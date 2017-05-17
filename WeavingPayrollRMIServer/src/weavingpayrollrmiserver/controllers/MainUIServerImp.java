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
import weavingpayrollrmiserver.models.Position;

/**
 *
 * @author chris
 */
public class MainUIServerImp extends UnicastRemoteObject implements MainUIServer {

    private static HashMap<String, Employee> employees = new HashMap<>();

    public MainUIServerImp() throws RemoteException {
        Employee cee = new Employee("1", "Christopher", "Espiritu");
        cee.setBirthday(LocalDate.of(1995, Month.JUNE, 5));
        cee.setHireDate(LocalDate.of(2017, Month.JANUARY, 23));
        cee.setPosition(Position.ADMIN);
        cee.setDaysWorked(144);
        cee.setSssContribution(581.3);
        cee.setPhilhealthContribution(437.5);

        Employee jom = new Employee("2", "Jose Mari", "Malong");
        jom.setBirthday(LocalDate.of(1998, Month.JUNE, 25));
        jom.setHireDate(LocalDate.of(2017, Month.FEBRUARY, 5));
        jom.setPosition(Position.MANAGER);
        jom.setDaysWorked(155);
        jom.setSssContribution(581.3);
        jom.setPhilhealthContribution(437.5);

        Employee roi = new Employee("3", "Roi", "Padilla");
        roi.setBirthday(LocalDate.of(1997, Month.MARCH, 5));
        roi.setHireDate(LocalDate.of(2017, Month.MARCH, 23));
        roi.setDaysWorked(160);
        roi.setPosition(Position.TAILOR);
        roi.setSssContribution(581.3);
        roi.setPhilhealthContribution(437.5);

        Employee mel = new Employee("4", "Melkee", "Rabbot");
        mel.setBirthday(LocalDate.of(1998, Month.APRIL, 23));
        mel.setHireDate(LocalDate.of(2017, Month.FEBRUARY, 3));
        mel.setPosition(Position.SUPERVISOR);
        mel.setDaysWorked(125);
        mel.setSssContribution(581.3);
        mel.setPhilhealthContribution(437.5);

        Employee johhnyWalker = new Employee("5", "Steven", "Tomines");
        johhnyWalker.setBirthday(LocalDate.of(1978, Month.DECEMBER, 16));
        johhnyWalker.setHireDate(LocalDate.of(2011, Month.JULY, 23));
        johhnyWalker.setPosition(Position.MAINTENANCE);
        johhnyWalker.setDaysWorked(25);
        johhnyWalker.setSssContribution(218);
        johhnyWalker.setPhilhealthContribution(100);

        employees.put("1", cee);
        employees.put("2", jom);
        employees.put("3", roi);
        employees.put("4", mel);
        employees.put("5", johhnyWalker);

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

    @Override
    public boolean clockIn(String id) throws RemoteException {
        return employees.get(id).timeIn();
    }

    @Override
    public boolean clockOut(String id) throws RemoteException {
        return employees.get(id).timeOut();
    }

}
