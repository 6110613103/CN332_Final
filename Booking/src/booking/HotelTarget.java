package booking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noeyyeon
 */
public interface HotelTarget {
    
    void printAvailableRooms();
    
    void bookByRoomNumber(int roomNumber);
}