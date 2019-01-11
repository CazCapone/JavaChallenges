package javachallenges;

import java.util.Scanner;

/**
 *
 * @author jduclos1
 * Enter a large number and this app will divide by 3 until it reaches 1; adding or subtracting 1 when division is impossible
 */
public class GameOfThrees {
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = 0;
        System.out.println("Please enter a large number to be divided: ");
        number = scan.nextInt();
        StartGame(number);
    }

    private static void StartGame(int number) {
        int count = 0;

        while (number != 1){
            if (number % 3 == 0){
                System.out.println(number + " 0");
                number = number / 3;
                count++;
            }else if ((number - 1) % 3 == 0){
                System.out.println(number + " -1");
                number = (number - 1) / 3;
                count++;
            }else if ((number + 1) % 3 == 0){
                System.out.println(number + " 1");
                number = (number + 1) / 3;
                count++;
            }       
         }  
         System.out.println("1");       
        }     
    }
