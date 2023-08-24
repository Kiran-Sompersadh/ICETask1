/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isetask1;

import java.util.Scanner;

/**
 *
 * @author ksomp
 */
public class Reptile extends Animal
{
    //declarations 
    private Double bloodTemp;

    //get and set methods 
    public Double getBloodTemp() {
        return bloodTemp;
    }

    public void setBloodTemp(Double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }
    
    //input method overides parentclass method 
    @Override
    public void input() 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("inputing reptile class");
        System.out.println("enter the animals ID tag number");  
        super.setIDtag(kb.nextInt());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("enter the animals species examples lizard, snake, bearded dragon");
        super.setSpecies(kb.next());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("input the tempreture of the reptiles blood in the format 0,0");  
        setBloodTemp(kb.nextDouble());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    
    //output method overriding parent class 
    @Override
    public void output()
     {
         System.out.println("outputing reptile class");
         System.out.println("The animals ID tag number is: "+super.getIDtag()+"\nThe animals species is: "+super.getSpecies()
         +"\nThe tempreture of the reptiles blood is: "+this.getBloodTemp());
         System.out.println("-----------------------------------------------------------------------------------------");
     }
}
