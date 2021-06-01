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

public class BaliHotel {
    public List availableRooms = new ArrayList<>();

    public BaliHotel() {
        
        availableRooms.add(new Room(104));
        availableRooms.add(new Room(210));
        availableRooms.add(new Room(307));
        availableRooms.add(new Room(400));
    }
    public List getAllAvailableRooms() {
        return availableRooms;
    }
    public void bookRoom(int roomNumber) {
        Room bookedRoom = new Room(104);
                
        if(bookedRoom != null){
            availableRooms.remove(bookedRoom);
            System.out.println("Room " + roomNumber + " has been booked.");
        }else{
            System.out.println("Requested room was not available.");
        }
    }
}
