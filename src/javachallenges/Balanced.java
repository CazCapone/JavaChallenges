/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javachallenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author jduclos1
 */
public class Balanced {

    public static void main(String[] args){
        
        System.out.println("xxxyyy " + balanced("xxxyyy"));
        System.out.println("yyyxxx " + balanced("yyyxxx"));    
        System.out.println("xxxyyyy " + balanced("xxxyyyy"));
        System.out.println("yyxyxxyxxyyyyxxxyxyx " + balanced("yyxyxxyxxyyyyxxxyxyx"));
        System.out.println("xyxxxxyyyxyxxyxxyy " + balanced("xyxxxxyyyxyxxyxxyy"));
        System.out.println("'' " + balanced(""));
        System.out.println("x " + balanced("x"));
    }
    
    private static boolean balanced(String s){
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'x'){
                x++;
            }else if (s.charAt(i) == 'y'){
                y++;
            }
        }
        
        if (x == y){
            return true;
        }else
            return false;
    }
    
}
