/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.games;

import java.util.Scanner;


/**
 *
 * @author DELL
 */
public class Games {

    public static void main(String[] args) {
        System.out.println("Welcome to the Games  World!");
        
         System.out.println("Let's dive deep into java concepts with games!");
         
          Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a game to play:");
        System.out.println("1. Memory Game");
        System.out.println("2. Number Guessing Game");
        System.out.println("3. Tic Tac Toe");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                MemoryGame.main(args);
                break;
            case 2:
                NumberGuessingGame.main(args);
                break;
            case 3:
                TicTacToe.main(args);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
        
    }
}
