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
public class Observer_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fruit_Store lavores = new Fruit_Store();
        
        Customer Camila = new Customer(lavores);
        Customer2 Silvia = new Customer2(lavores);
        Customer3 Gabriel = new Customer3(lavores);
        
        lavores.setPrices(2.30, 1.70, 3.2);
        lavores.setPrices(2.50, 1.40, 2.2);
        lavores.setPrices(2.40, 1.80, 3.5);
    }
    
}
