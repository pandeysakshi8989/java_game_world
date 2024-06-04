/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.games;
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Scanner; 
/**
 *
 * @author DELL
 */
public class MemoryGame {
    public static void main(String[] args) 
	{ 
                System.out.println("Memory Game started!");
		Scanner scanner = new Scanner(System.in); 
		ArrayList<String> cards = new ArrayList<>(); 
		cards.add("A"); 
		cards.add("A"); 
		cards.add("B"); 
		cards.add("B"); 
		cards.add("C"); 
		cards.add("C"); 
		cards.add("D"); 
		cards.add("D"); 
		Collections.shuffle(cards); 

		String[] board = new String[cards.size()]; 
		boolean[] flipped = new boolean[cards.size()]; 
		int pairsFound = 0; 

		while (pairsFound < 4) { 
			printBoard(board); 
			int firstIndex = getCardIndex( 
				scanner, board, flipped, 
				"Enter index of first card to flip:"); 
			board[firstIndex] = cards.get(firstIndex); 
			flipped[firstIndex] = true; 
			printBoard(board); 
			int secondIndex = getCardIndex( 
				scanner, board, flipped, 
				"Enter index of second card to flip:"); 
			board[secondIndex] = cards.get(secondIndex); 
			flipped[secondIndex] = true; 

			if (cards.get(firstIndex) 
					.equals(cards.get(secondIndex))) { 
				System.out.println("You found a pair!"); 
				pairsFound++; 
			} 
			else { 
				System.out.println( 
					"Sorry, those cards don't match."); 
				board[firstIndex] = " "; 
				board[secondIndex] = " "; 
				flipped[firstIndex] = false; 
				flipped[secondIndex] = false; 
			} 
		} 
		 
		System.out.println("Congratulations, you won!"); 
	} 

	public static int getCardIndex(Scanner scanner, 
								String[] board, 
								boolean[] flipped, 
								String prompt) 
	{ 
		int index; 
		while (true) { 
			System.out.println(prompt); 
			index = scanner.nextInt(); 
			if (index < 0 || index >= board.length) { 
				System.out.println( 
					"Invalid index, try again."); 
			} 
			else if (flipped[index]) { 
				System.out.println( 
					"Card already flipped, try again."); 
			} 
			else { 
				break; 
			} 
		} 
		return index; 
	} 

	public static void printBoard(String[] board) 
	{ 
		for (int i = 0; i < board.length; i++) { 
			System.out.print("| " + board[i] + " "); 
		} 
		System.out.println("|"); 
	} 
}
