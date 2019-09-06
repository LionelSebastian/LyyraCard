
import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        
        CashRegister unicafeExactum = new CashRegister();
        
        ArrayList<LyyraCard> lyyraCards = new ArrayList<LyyraCard>(); 
        Menu gourmet = new Menu("Gourmet",4.0);
        Menu economical = new Menu("Economical",2.5);
        
        LyyraCard card1 = new LyyraCard(100.0,"Jimny",29,3,1983);        
        lyyraCards.add(card1);
        
        
        System.out.println( unicafeExactum );
        System.out.println("the card balance " + card1.balance() + " euros"); 
        
        while (true){
        System.out.println("1.Pay gourmet(4.0)");
        System.out.println("2.Pay economical(2.5)");
        System.out.println("3.Get balance and exit");
        System.out.println("Choose an option:");
        Scanner reader = new Scanner(System.in);
        String option = reader.nextLine();
        
             if(option.contains("1")){
             unicafeExactum.pay(card1,economical);          
             System.out.println( unicafeExactum );
             System.out.println(" Your card balance is: "+card1.balance());
             }
        }
    }
}
        
        

            
        
 