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
public class Animal //parent class
{
    //declarations
    private int IDtag = 0;
    private String species = "";
    
    //gets and sets 
    public int getIDtag() {
        return IDtag;
    }

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    //populating veriables overiden by child classes
     public void input() 
     {
         Scanner kb = new Scanner(System.in);
         System.out.println("inputing animal class");
         System.out.println("enter the animals ID tag number");  
         setIDtag(kb.nextInt());//inputing to set method 
         System.out.println("-----------------------------------------------------------------------------------------");
         System.out.println("enter the animals species examples ostrich, dove, chicken,  lizard, snake, bearded dragon");
         setSpecies(kb.next());
         System.out.println("-----------------------------------------------------------------------------------------");
     }
     
     //outputing values overriden by child classes 
     public void output()
     {
         System.out.println("outputing animal class");
         System.out.println("The animals ID tag number is: "+getIDtag()+"\nThe animals species is:"+getSpecies());
         System.out.println("-----------------------------------------------------------------------------------------");
     }
    
}
