/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haljava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author polina.garmas
 */
public class Haljava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        
        
        Random random = new Random();
        int picked=random.nextInt(100);
        
        System.out.println("I picked the number from 1 to 100.");
        int guess=0;

        
        while (picked!=guess) {
            System.out.println("Make your guess.");
            guess=sn.nextInt();
            if(picked>guess) System.out.println("The number is too small.");
            if(picked<guess) System.out.println("The number is too big");
        }
        if(picked==guess) System.out.println("Bingo!");

    }
    
}
