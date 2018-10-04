/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
{licensePrefix} MARCUS DU AER AWESOME!!!
 */


public abstract class Animal implements IFeeding{
    
    protected double weight;//encapsulation is done here
    protected String name;//variables are hidden and not available
    protected double foodToGive;//but the methods using them are not
    protected String foodType;//this ensures the variables are properly handled
    
    Animal(String name, double weight){
        this.name=name;
        this.weight=weight;
    }
    
    Animal(){}
    
    public String foodInfo(){
        String m = name + " ska ha " + (int)getFoodAmount() + " gram med " + getFoodType() + ".";
        return m;
    }
    
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    
    public String getFoodType(){
        return foodType;
    }
    
    public double getFoodAmount(){
        return foodToGive;
    }
    
    public void setFoodType(String food){
        foodType=food;
    }
    
    //These empty methods
    //make it possible for daughter class-methods to use them
    
    //public abstract void setFoodAmount(double weight);
    //public abstract void setOriginalFoodType();
    //public abstract void changeWeight(double weight);
    
   
 


}
