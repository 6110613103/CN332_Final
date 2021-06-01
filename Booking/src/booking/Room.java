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
import java.util.Scanner;

public class Room implements RoomIn {
    public List RoomsOp = new ArrayList<>();
    int no;
    
    String sb = "1. single bed";
    String tb = "2. Twin bed";
    String ww = "1. I Want Wi-Fi";
    String dw = "2. I Don't want Wi-Fi";
    
    Room(int i) {
        no = i;
        System.out.print("Number of day : ");
        Scanner sn = new Scanner(System.in);
        String n = sn.next();
        int day = Integer.parseInt(n);
        date(day);
    }

    @Override
    public void options() {
        System.out.print("Adult : ");
        Scanner a = new Scanner(System.in);
        String ad = a.next();
        int adl = Integer.parseInt(ad);
        RoomsOp.add(adl);
        System.out.print("Child : ");
        Scanner c = new Scanner(System.in);
        String cd = a.next();
        int cdn = Integer.parseInt(cd);
        RoomsOp.add(cdn);
        
        System.out.println("Select Hotel Options");
        System.out.println("Bed (choose Number)");
        System.out.println(sb);
        System.out.println(tb);
        Scanner sn = new Scanner(System.in);
        String n = sn.next();
        int bed = Integer.parseInt(n);
        if (bed == 1){
            RoomsOp.add(sb);
        }else{RoomsOp.add(tb);}
        
        System.out.println("Select Hotel Options");
        System.out.println("Wi-Fi (choose Number)");
        System.out.println(ww);
        System.out.println(dw);
        Scanner snn = new Scanner(System.in);
        String nn = snn.next();
        int wf = Integer.parseInt(nn);
        if (wf == 1){
            RoomsOp.add(ww);
        }else{RoomsOp.add(dw);}
        System.out.println("Your Options");
        for(int i=3;i<RoomsOp.size();i++){
            System.out.println(RoomsOp.get(i));
        } 
        pro();
        price();
        
    }


    @Override
    public void date(int day) {
        RoomsOp.add(day);
        System.out.print("Check In Date : ");
        Scanner snn = new Scanner(System.in);
        String nn = snn.next();
        System.out.print("Check Out Date : ");
        Scanner sn = new Scanner(System.in);
        String n = sn.next();
        options();
    }

    @Override
    public void pro() {
        int day = (int) RoomsOp.get(0);
        if(day > 4){
            Promo pro = new Promo(day);
        } else {
            System.out.println("No Many day Promotion");
        }
    }

    @Override
    public void price() {
        int count;
        if(RoomsOp.get(3) == sb){
            count = 1000;
            count = count*(int)RoomsOp.get(0);
        }else{
            count = 2000;
            count = count*(int)RoomsOp.get(0);
        }
        if(RoomsOp.get(4) == ww){
            count = count + (200*(int)RoomsOp.get(0));
        }
        
        System.out.println("Do you have a Discount Coupon?");
        System.out.print("Yes / No : ");
        Scanner sn = new Scanner(System.in);
        String n = sn.next();
        if(n == "Yes"){
            System.out.print("Your Discount Coupon : ");
            Scanner dd = new Scanner(System.in);
            String dis = dd.next();
            if(dis == "444"){
                count = count - ((count/100)*10);
                System.out.println("Your Price : " + count);
            
            }else if(dis == "555") {
                count = count - ((count/100)*15);
                System.out.println("Your Price : " + count);}
            else{
                System.out.println("Worng!");}
            }
        
        else{
            System.out.println("Your Price : " + count);}
    
}}

