/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

/**
 *
 * @author noeyyeon
 */

import java.util.ArrayList;
import java.util.List;

public class Room implements RoomIn {
    int no;
    
    Room(int i) {
        i = no;
    }

    @Override
    public void options() {
        System.out.println("Hotel Option");
    }

    @Override
    public int getRoomNumber() {
        return no;
    }
    
}
