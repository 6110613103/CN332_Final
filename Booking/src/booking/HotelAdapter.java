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
import java.util.List;
public class HotelAdapter implements HotelTarget {
    private final BaliHotel hotel;
    
    public HotelAdapter(BaliHotel hotel) {
        this.hotel = hotel;
    }
    @Override
    public void printAvailableRooms() {
        List allAvailableRooms = hotel.getAllAvailableRooms();
        System.out.println("Rooms Available:");

    }
    @Override
    public void bookByRoomNumber(int roomNumber) {
        hotel.bookRoom(roomNumber);
    }
}
