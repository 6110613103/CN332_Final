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

import java.util.Scanner;

public class BaliHotel {
    int no;

    public BaliHotel() {
        System.out.print("Room No. : ");
        Scanner sn = new Scanner(System.in);
        String n = sn.next();
        no = Integer.parseInt(n);
        System.out.println("Your Room is " + no);
        Room bookedRoom = new Room(no);
 
    }

    public void bookRoom(int roomNumber) {
        System.out.println("Select Pay");
        System.out.println("1. Cash");
        System.out.println("2. Credit");
        
        Scanner sn = new Scanner(System.in);
        String n = sn.next();
        int p = Integer.parseInt(n);
        if(p == 1){
            pay count = new pay(p);
            }
        else{pay count = new pay(p);}
    }
}
