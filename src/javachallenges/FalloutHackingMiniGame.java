/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachallenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jduclos1
 * Fallout hacking mini game copy **need to come back to this one**
 */
public class FalloutHackingMiniGame {
    Scanner scan = new Scanner(System.in);
    private  char[] password;
    private  char[] guess;
    private  int chances = 4;
    private  char[] yourGuess; 
    
    private Path path;
    
    
    
    public static void main(String[] args) throws IOException, URISyntaxException{
        FalloutHackingMiniGame game = new FalloutHackingMiniGame();
        game.gameLoop();
    }
    
    private void gameLoop() throws IOException, URISyntaxException{
        int difficulty = 0;    
        while (difficulty == 0){
          System.out.println("Please select difficulty level (1-5): ");
          difficulty = scan.nextInt(); 
          
          if (difficulty < 1 || difficulty > 5){
                System.out.println("Please enter a difficulty level from 1-5. ");
            }else{
                displayWords(difficulty);
            }
        }
        StartGame();
    }

    private void StartGame() {
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

    private char[] displayWords(int difficulty) throws IOException, URISyntaxException {
        String str = "taco";
        password = str.toCharArray();
        int level = difficulty;
        
        

        buildDictionary(level);
        return password;
    }

    private void buildDictionary(int level) throws IOException, URISyntaxException{
     //   Path path = Paths.get("src\\javachallenges\\falloutDictionary.txt"); 
        Random rand = new Random();
        int listSize = rand.nextInt(5);
        
        List[] list = new List[listSize]; 
                Files.readAllLines(Paths.get("src\\javachallenges\\falloutDictionary.txt"));
        
        //List<String> list = Files.readAllLines(path);
        
        
        //System.out.println(list.);
        
        //System.out.println(pass);
        
        //level 1: 3-4 letters
        //level 2: 5-6 letters
        //level 3: 7-8 letters
        //level 4: 9-10 letters
        //level 5: 11+ letters
        

    }
  
    
    
    
    
    
}
