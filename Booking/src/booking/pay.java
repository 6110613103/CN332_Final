/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.util.Scanner;

/**
 *
 * @author noeyyeon
 */
public class pay {

    pay(int c) {
        if(c==1){
        cash();}
        else{ credit();}
    }
    
    public void cash() {
        System.out.println("Your count is : ");
        Scanner snn = new Scanner(System.in);
        String nn = snn.next();
        int no = Integer.parseInt(nn);
        System.out.println("Your pay is : ");
        Scanner snnv = new Scanner(System.in);
        String nnv = snnv.next();
        int noo = Integer.parseInt(nnv);
        System.out.println("Your Shorten is : " + (noo - no) );
    }
    public void credit() {
        System.out.println("Your count is : ");
        Scanner snn = new Scanner(System.in);
        String nn = snn.next();
        System.out.println("Your cart is : ");
        Scanner snnn = new Scanner(System.in);
        String nnn = snnn.next();
        System.out.println("success");
}
}
