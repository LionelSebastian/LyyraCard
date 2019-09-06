/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author La Potra
 */
public class Menu {
    
     private double price;  
     private String name;
    
    
    public Menu (String name,double amount){
        price = amount;
        name = name;
    }
    
    
    public double getMenuPrice(){
        return this.price;
    }
        
}



        
