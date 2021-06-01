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
public class Promo {
    //add promotion
    
    Promo(int day){
        manyday(day);
    }
    
    public void manyday(int day){
        if(day == 4){
            System.out.println("Your discout code is 444");
        }else{
            System.out.println("Your discout code is 555");
        }
    }
    
}
