/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
{licensePrefix} MARCUS DU AER AWESOME!!!
 */


public interface IFeeding {
    //this interface
    //ensures that all new creature-classes made
    //will assign the proper information to the animals
    
    public void setFoodAmount(double weight);
    
    public void setOriginalFoodType();
    
    public void changeWeight(double weight);
}
