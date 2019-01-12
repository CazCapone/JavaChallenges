/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachallenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jduclos1
 * Fallout hacking mini game copy
 */
public class FalloutHackingMiniGame {
    static Scanner scan = new Scanner(System.in);
    private static char[] password;
    private static char[] guess;
    private static int chances = 4;
    private static char[] yourGuess; 
    
    
    public static void main(String[] args){
        int difficulty;    
        System.out.println("Please select difficulty level (1-5): ");
        difficulty = scan.nextInt();
        displayWords(difficulty);
        
        StartGame();
    }

    private static void StartGame() {
        int count = 0;
        yourGuess = new char[password.length];
        
        do{
        System.out.println("Guess the password: " + chances + " chances left ... " );
        guess = scan.next().toLowerCase().toCharArray();

            if (Arrays.equals(guess, password)){
                System.out.println("You guessed the password! It was " + password);
                break;
            }else {
                for (int i = 0; i < password.length; i++){
                    if (guess[i] == password[i]){
                        yourGuess[i] = guess[i]; 
                        System.out.print(yourGuess[i]);
                        count++;
                    }else{
                        System.out.print("_");
                        for(char c : password){
                            if (c == guess[i]){
                                count++;
                            }
                        }
                    }
                    
                }
                System.out.println(" You got " + count + " letters out of " + password.length + " correct! " );
                count = 0;
            }
            if (guess.equals(password)){
            System.out.println("You guessed the password! It was " + password);
            break;
            }else{
               // if(password.)

     //      System.out.println(guess);
            chances--;
            }
        
        
        }while (chances != 0);
           
        
    }

    private static char[] displayWords(int difficulty) {
        String str = "taco";
        password = str.toCharArray();
        
        
        
        return password;
    }

 
  
    
    
    
    
    
}
