/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern;

/**
 *
 * @author Leandro
 */
public class Customer2 implements Observer{
    
    
    private double orangesPrice;
     
    private double lemonsPrice;
    
    private Subject fruit_store_obj;
    
    public Customer2(Subject fruit_store_object) {
        
        this.fruit_store_obj = fruit_store_object;
        fruit_store_object.register(this);
            
    }
    
    public void update(double applesPrice, double orangesPrice, double lemonsPrice) {
       
        this.lemonsPrice = lemonsPrice;
        this.orangesPrice = orangesPrice;
        takeNote();
    }
    public void takeNote(){
        System.out.print("I am Customer 2, and i care about lemons and oranges.\n"
                + "lemons price is : "+this.lemonsPrice+"\n"
        + "and oranges price is: "+this.orangesPrice+"\n"+"\n");
    }
    
}
