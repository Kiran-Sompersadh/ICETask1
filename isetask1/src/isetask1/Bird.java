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
public class Bird extends Animal
{
    //declarations
    private int Colour;

    //gets and set
    public int getColour() {
        return Colour;
    }

    public void setColour(int Colour) {
        this.Colour = Colour;
    }
    
    //input method overides parentclass method 
    @Override
    public void input() 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("inputing bird class");
        System.out.println("enter the animals ID tag number");  
        super.setIDtag(kb.nextInt());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("enter the animals species examples ostrich, dove, chicken");
        super.setSpecies(kb.next());
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("input the colour of the birds feathers options are provided \n1 = grey, \n2 = white, \n3 = black");  
        setColour(kb.nextInt());
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    
    //output method overriding parent class 
    @Override
    public void output()
     { 
         System.out.println("outputing bird class");
         //giving meaning to the number saved in colour
         String colour="";
         switch (this.getColour()) {
             case 1: colour = "grey";break;
             case 2: colour = "white";break; 
             case 3: colour = "black";break;    
             default:
     }
         System.out.println("The animals ID tag number is: "+super.getIDtag()+"\nThe animals species is: "+super.getSpecies()
         +"\nThe colour of the birds feathers are: "+colour);
         System.out.println("-----------------------------------------------------------------------------------------");
     }
}
