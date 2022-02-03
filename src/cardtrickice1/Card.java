/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    private int value;  //1-13
    private String suits; //encapsulation   // diamonds
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        // value = (int)(Math.random()*13) + 1;
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        //int name = (int)(Math.random()*4) ;
        //suits = SUITS[name];
        //this.suits = suits;
        this.suits = suits;
    }
   //number
    
    //method for suits
    
     public String toString()
    {
        return "" + getValue() + "  of  " + getSuits();
    }
    
}
