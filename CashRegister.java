
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister = 1000;
    }
    
    public String pay(LyyraCard card,Menu menu) {
        // price of the economical lunch is 2.50 euros
       if (card.pay(menu)) // if the given cash is at least the price of the lunch:
       {cashInRegister += menu.getMenuPrice();// the price of lunch is added to register
       economicalSold ++; //    the amount of sold lunch is incremented by one
       return "Done..Thanks";}
       else{ return "Not Enough credit..load your card and ciome back..thanks";}
       }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
       if (cashGiven >= 2.5) // if the given cash is at least the price of the lunch:
       {cashInRegister += 2.5;// the price of lunch is added to register
       economicalSold ++; //    the amount of sold lunch is incremented by one
       return cashGiven-2.5;} //    method returns cashGiven - lunch price 
       else {return cashGiven;}// if not enough money given, all is returned and nothing else happens        
       }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        if (cashGiven >=4.0){// if the given cash is at least the price of the lunch:
        cashInRegister += 4.0;//    the price of lunch is added to register
        gourmetSold ++;//    the amount of sold lunch is incremented by one
        return cashGiven-4.0;}//    method returns cashGiven - lunch price 
        else {return cashGiven;}// if not enough money given, all is returned and nothing else happens
        }
    
     /*public boolean payEconomical(LyyraCard card) {
       double priceEconomical = 2.5;// the price of the economical lunch is 2.50 euros
       if (card.balance() >= priceEconomical) // if the balance of the card is at least the price of the lunch:
       {economicalSold ++;//    the amount of sold lunches is incremented by one
       card.pay(priceEconomical);
       return true;}//    the method returns true
       else { return false;}// if not, the method returns false
    }

    public boolean payGourmet(LyyraCard card) {
        double priceGourmet=4.0;// the price of the gourmet lunch is 4.00 euros
        if ( card.balance()>= priceGourmet)// if the balance of the card is at least the price of the lunch:
        {card.pay(priceGourmet);
        gourmetSold++;//    the amount of sold lunches is incremented by one
        return true;}//    the method returns true
       else { return false;} // if not, the method returns false
    }*/
   
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
