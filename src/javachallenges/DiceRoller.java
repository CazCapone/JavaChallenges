/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachallenges;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jduclos1
 */
public class DiceRoller {
    
    static int diceCount = 0; //between 1 - 100
    static int diceSide = 0; //between 2 - 100
    static int diceTotal = 0;
    
    
    
    
    public static void main(String[] args){
        String input = null;      
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter dice count and side number in #d# format. ");
        input = scan.nextLine();
        RollDice(input);
        
        System.out.println(diceCount);
        System.out.println(diceSide);
    }
    
    
    
    
    
    public static int RollDice(String s){
        String[] count = s.split("d");
           
        diceCount = Integer.parseInt(count[0]);
        diceSide = Integer.parseInt(count[1]);   
        
        if ((diceCount < 1 || diceCount > 100) && (diceSide < 2 || diceSide > 100)){
            System.out.println("No");
        }else{
            
        
            
        Random roll = new Random(); 
        for (int i = 0; i < diceCount; i++){
            
        }
        int r = roll.nextInt(diceSide) + 1; 
            
            
        }
        
   
        
        
        
        
        
        System.out.println("Sides " + diceSide );
        System.out.println("Your roll " + r);
        
        return r;
        //return diceTotal;
    }
    
    
    
/*5d12
6d4
1d2
1d8
3d6
4d20
100d100
*/    
    
}
