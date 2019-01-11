package javachallenges;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jduclos1
 * Dungeons and Dragons Dice Roller - for different dice sides
 */
public class DiceRoller {  
    static int diceCount = 0; //between 1 - 100
    static int diceSide = 0; //between 2 - 100
    static int diceTotal = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        StartGame();
    }
    
    public static void StartGame(){
        String input = null;   
        String answer = null;
        System.out.println("Please enter dice count and side number in #d# format. ");
        input = scan.nextLine();
        RollDice(input);
        
        System.out.println("Would you like another roll? Y or N ");
        answer = scan.nextLine();
        if (answer.equals("Y") || answer.equals("y") || answer.equals("yes") || answer.equals("Yes") || answer.equals("YES")){
            StartGame();
        }else{
            System.out.println("Thanks for playing.");
        }
    }

    public static void RollDice(String s){
        if (!s.contains("d")){
            System.out.println("Enter dice count and side number in #d# format! ");
        }else{
        String[] count = s.split("d");
           
        diceCount = Integer.parseInt(count[0]);
        diceSide = Integer.parseInt(count[1]);   
        
        if (diceCount < 1 || diceCount > 100 || diceSide < 2 || diceSide > 100){
            System.out.println("No");
        }else{
            Random rand = new Random(); 
            for (int i = 0; i < diceCount; i++){
                int roll;
                roll = rand.nextInt(diceSide) + 1;
                diceTotal += roll; 
                System.out.println("You have rolled a " + roll + " on die #" + (i + 1));
            }
        }
        System.out.println("Your Total Roll Equals " + diceTotal);
        }
    } 
}
