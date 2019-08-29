/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern;

import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class Fruit_Store implements Subject{
    
    private double applesPrice;
    
    private double orangesPrice;
     
    private double lemonsPrice;
    
    private ArrayList<Observer> observers;
    
    //the constructor creates the array
    public Fruit_Store(){
        observers = new ArrayList<Observer>();
    }
    
    public void register(Observer o){
        observers.add(o);
    }
    public void unregister(Observer o){
        int indexOfO = observers.indexOf(o);
        observers.remove(indexOfO);
        
    }
    public void notifyObserver(){
    
        for(int i=0; i < observers.size(); i++){
            
            observers.get(i).update(applesPrice, orangesPrice, lemonsPrice);
        
        }
    }
    public void pricesChanged(){
        notifyObserver();
    }
    //now i make a method that holds the setters for the properties AND the pricesChanged method
    public void setPrices(double applesPrice, double orangesPrice, double lemonsPrice){
        this.applesPrice = applesPrice;
        this.orangesPrice = orangesPrice;
        this.lemonsPrice = lemonsPrice;
        
        pricesChanged();
    }
}
