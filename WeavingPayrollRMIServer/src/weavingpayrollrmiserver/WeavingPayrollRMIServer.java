/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weavingpayrollrmiserver;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import weavingpayrollrmiserver.controllers.MainUIServerImp;
import weavingpayrollrmiserver.interfaces.MainUIServer;

/**
 *
 * @author chris
 */
public class WeavingPayrollRMIServer {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.AlreadyBoundException
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        MainUIServer mainController = new MainUIServerImp();
        Registry reg = LocateRegistry.createRegistry(1099);
        reg.bind("mainController", mainController);
        System.out.println("Server running...");
    }

}
