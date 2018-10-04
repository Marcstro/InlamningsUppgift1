/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
{licensePrefix} MARCUS DU AER AWESOME!!!
 */


public class Cat  extends Animal{

    
    public static final double FOOD_RATIO = (1.0/150.0);
    
    
    public Cat(String name, double weight){
            super(name, weight);
            foodToGive=weight*FOOD_RATIO;
            foodType="kattfoder";
    } 
    public void setFoodAmount(double weight){
    foodToGive=weight*FOOD_RATIO;
    }
    public void setOriginalFoodType(){
    foodType="kattfoder";
    }
    public void changeWeight(double weight){
        this.weight=weight;
        setFoodAmount(weight);
    }
}
