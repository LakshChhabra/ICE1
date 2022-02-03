/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Random;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner CG = new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
        boolean a =false;
       
        
     
        
        for( int i=0; i<magicHand.length; i++  ) 
        {
            Random r = new Random();
            int rand = r.nextInt(12)+1;
            
            Random rs = new Random();
            int randSuit = rs.nextInt(3);
            
            Card c1 = new Card();
            c1.setValue(rand);//use a method to generate random *13
            c1.setSuits(Card.SUITS[randSuit]);//random method suit
            
            magicHand[i] = c1;
        }
        
        for( int i=0; i<magicHand.length; i++  ) 
        {
            
            System.out.println("Suit:"+magicHand[i].getSuits()+"|value:"+magicHand[i].getValue());
            //equals string method
        }
        
        //step 2:take input 
        System.out.println("Enter a number from 1 to 13: ");
       int CardNumber = CG.nextInt();
        
        
        System.out.println("Enter a suit > hearts, diamonds, clubs, spades");
        String CardSuit = CG.next();
            
            
        //step 3: match with array 
        for(int i=0;i<magicHand.length;i++)
        {
            if((magicHand[i].getValue() == CardNumber) && magicHand[i].getSuits().equalsIgnoreCase(CardSuit) ) 
            {
                a = true;

            //System.out.println("found your card");
           
            }
            
        }
        
        if(a == true)
        {
            System.out.println("found your card");
        }
        else
            System.out.println("not found  card");
               
       }
}
    