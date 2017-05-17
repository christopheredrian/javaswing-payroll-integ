/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.slu.weavingpayrollapp.ui;

import weavingpayrollrmiserver.models.Position;

/**
 *
 * @author chris
 */
public class Utilities {

    public static Position parsePosition(String pos) {
        switch (pos) {
            case "Admin":
                return Position.ADMIN;
            case "Maintenance":
                return Position.MAINTENANCE;
            case "Tailor":
                return Position.TAILOR;
            case "Manager":
                return Position.MANAGER;
            case "Supervisor":
                return Position.SUPERVISOR;
        }
        return null;
    }
}
