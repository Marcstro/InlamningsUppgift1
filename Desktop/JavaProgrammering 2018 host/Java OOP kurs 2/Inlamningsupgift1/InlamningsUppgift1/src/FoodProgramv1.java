/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
{licensePrefix} MARCUS DU AER AWESOME!!!
 */
import javax.swing.*;
import java.util.*;

//made by Marcus Strom
//2018-09-01


public class FoodProgramv1 {

    public static void main(String args[]){
        
        
         List<Animal> djuren = new LinkedList<>();//this is a list, currently empty
         //we will add creatures to it
         
         Animal djur1=new Dog("Sixten", 5000.0);
        //here we use polymorphism
        //we give djur1, which is an Animal() class
        //the methods available in the Dog() class
         djuren.add(djur1);//adding creatures to the list, 1 by 1
         
         Animal djur2=new Dog("Dogge", 10000.0);
         djuren.add(djur2);
         
         Animal djur3=new Cat("Venus", 5000.0);
         djuren.add(djur3);
         
         Animal djur4=new Cat("Ove", 3000.0);
         djuren.add(djur4);
         
         Animal djur5=new Snake("Hypno", 1000.0);
         djuren.add(djur5);
         
         
         String djuret = JOptionPane.showInputDialog("Vilket djur ska ha mat?");
         
         int hittat=0;//a variable to check if the creature exists
         for(Animal a: djuren){
             if(djuret.equalsIgnoreCase(a.getName())){//check name of each animal
                 JOptionPane.showMessageDialog(null, a.foodInfo());
                 hittat++;
                 break;
             }
         }
         if(hittat==0){//error message if no animal found
             String temp="Inget sadant djur finns har. Foljande djur finns: ";
             for(Animal a: djuren){
                 temp+=(a.getName() + ", ");
             }
             JOptionPane.showMessageDialog(null, temp);
         }
         
    }
    

}
