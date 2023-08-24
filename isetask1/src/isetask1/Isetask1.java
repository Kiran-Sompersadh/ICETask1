/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isetask1;

import java.util.Scanner;

/**
 *
 * @author ksomp
 */
public class Isetask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int animalType;
        Scanner kb = new Scanner(System.in);
        
        //prompting user
        System.out.println("enter 1 if the animal is clasified as a bird or 0 if it is a Reptile ");
        animalType=kb.nextInt();
        System.out.println("-----------------------------------------------------------------------------------------");
        
        //using user input to choose a method to acces a specific class
        switch (animalType) 
        {
            case 1: Bird(); break;
            
            case 0: Reptile(); break;
            
            default: System.out.println("invalid choice"); break;
        }
    }
    
    //method to acces bird class
    public static void Bird()
    {
       Bird brd = new Bird(); //object
       brd.input();//calling methods
       brd.output();
    }
    
    //method to acces reptile class
    public static void Reptile()
    {
       Reptile rept = new Reptile();
       rept.input();
       rept.output();
    }
}
