/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.slu.weavingpayrollapp.controllers;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import weavingpayrollrmiserver.interfaces.MainUIServer;

/**
 *
 * @author chris
 */
public class RMIController {

    public static MainUIServer getMainUIServer() {
        try {
            // create a registry class and locate the running registry
            String ip = "192.168.254.111";
            ip = "localhost";
            System.out.println(ip);
            Registry registry = LocateRegistry.getRegistry(ip);

            // lookup the name of the remote instance in the server and assign it to the named interface using a cast
            MainUIServer mainController = (MainUIServer) registry.lookup("mainController");
            return mainController;
//            Sample comp = (Sample) registry.lookup(name);
            // execute the methods (remotely)
//            System.out.println(comp.test("this is my name"));
        } catch (RemoteException e) {
            System.err.println(e.getMessage());
        } catch (NotBoundException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public static void main(String[] args) throws RemoteException {
        MainUIServer mainUIServer = getMainUIServer();
        System.out.println(mainUIServer.getEmployees());

    }
}
