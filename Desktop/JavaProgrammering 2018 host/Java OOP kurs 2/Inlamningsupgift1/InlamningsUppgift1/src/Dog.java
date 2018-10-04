/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
{licensePrefix} MARCUS DU AER AWESOME!!!
 */


public class Dog extends Animal{

   
    public static final double FOOD_RATIO = (0.01);
    
    
    public Dog(String name, double weight){
            super(name, weight);
            foodToGive=weight*FOOD_RATIO;
            foodType="hundfoder";
    } 
    public void setFoodAmount(double weight){
    foodToGive=weight*FOOD_RATIO;
    }
    public void setOriginalFoodType(){
    foodType="hundfoder";
    }
    public void changeWeight(double weight){
        this.weight=weight;
        setFoodAmount(weight);
    }
    
}
