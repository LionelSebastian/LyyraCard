/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author La Potra
 */
public class MyDate {

   private int year;
   private int day;
   private int month;
   
   public MyDate (int day, int month, int year){
   this.year=year;
   this.day=day;
   this.month=month;
   }
   
   public String toString()
   {return ":"+this.day+" age:"+this.month+""+this.year;}
}