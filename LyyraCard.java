
import java.util.ArrayList;


public class LyyraCard {

    private double balance;
    private Person Owner;
    private MyDate date;
    
  
    public LyyraCard(double balance,String owner,int day,int month,int year) {
        this.balance = balance;
        Person own = new Person(owner);
        MyDate beginAt = new MyDate(day,month,year);
        
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(LyyraCard card, double amount) {
        this.balance += amount;
    }

    public boolean pay(Menu menu) {
        if (this.balance >= menu.getMenuPrice())
        {this.balance -= menu.getMenuPrice();
        return true;}
        else{return false;}
    }
   
}
