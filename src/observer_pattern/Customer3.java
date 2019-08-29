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
public class Customer3 implements Observer{
    
    private double applesPrice;
         
    private double lemonsPrice;
    
    private Subject fruit_store_obj;
    
    public Customer3 (Subject fruit_store_object) {
        
        this.fruit_store_obj = fruit_store_object;
        fruit_store_object.register(this);
            
    }
    
    public void update(double applesPrice, double orangesPrice, double lemonsPrice) {
       
        this.lemonsPrice = lemonsPrice;
        this.applesPrice = applesPrice;
        takeNote();
    }
    public void takeNote(){
        System.out.print("I am Customer 3, and i care about lemons and apples.\n"
                + "lemons price is : "+this.lemonsPrice+"\n"
        + "and apples price is: "+this.applesPrice+"\n"+"\n");
    }
    
}
