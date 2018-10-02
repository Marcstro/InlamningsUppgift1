/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
{licensePrefix} MARCUS DU AER AWESOME!!!
 */


public class Snake  extends Animal implements IFeeding{

    
    public Snake(String name, double weight){
            super(name, weight);
            foodToGive=20;
            foodType="Ormpellets";
    } 
    public void setFoodAmount(double weight){
    foodToGive=20;
    }
    public void setOriginalFoodType(){
    foodType="ormpellets";
    }
    public void changeWeight(double weight){
        this.weight=weight;
    }
}
