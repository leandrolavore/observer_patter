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
public class Customer implements Observer{
    
    private double applesPrice;
    
    private double orangesPrice;
    
    private Subject fruit_store_obj;

    public Customer(Subject fruit_store_object) {
        
        this.fruit_store_obj = fruit_store_object;
        fruit_store_object.register(this);
            
    }
     
    
   
    public void update(double applesPrice, double orangesPrice, double lemonsPrice) {
       
        this.applesPrice = applesPrice;
        this.orangesPrice = orangesPrice;
        takeNote();
    }
    public void takeNote(){
        System.out.print("I am Customer 1, and i care about apples and oranges.\n"
                + "apples price is : "+this.applesPrice+"\n"
        + "and oranges price is: "+this.orangesPrice+"\n"+"\n");
    }
}
