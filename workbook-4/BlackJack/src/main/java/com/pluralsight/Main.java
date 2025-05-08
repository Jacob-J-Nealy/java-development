package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Prompt for Players
        System.out.print("Please Enter Player 1 Username: ");
        String player1UserName = scanner.nextLine();
        System.out.print("Please Enter Player 2 Username: ");
        String player2UserName = scanner.nextLine();

        System.out.println(player1UserName + " vs " + player2UserName);

        //Created New Deck Based on Deck Class
        Deck deck = new Deck();

        // Shuffle Deck
        deck.shuffle();

        // Created Two Hands (One for Each Player)
        Hand player1Hand = new Hand();
        Hand player2Hand = new Hand();

        //Deal Two Cards to Each Player's Hand

        // Adding Two Cards to Player 1 Hand
        for (int i = 0; i < 2 ; i++) {
            //Action Method to deal top card
            Card card = deck.deal();
            // Adds Card to Hand Array List....I think
            player1Hand.deal(card);
        }

        // Adding Two Cards to Player 2 Hand
        for (int i = 0; i < 2 ; i++) {
            //Action Method to deal top card
            Card card = deck.deal();
            // Adds Card to Hand Array List....I think
            player2Hand.deal(card);
        }

        player1Hand.print();
        player2Hand.print();

        int player1Score = player1Hand.getValue();
        int


    }
}
