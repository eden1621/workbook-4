package com.pluralsight;

import java.util.*;

public class CardApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for player 1: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Enter name for player 2: ");
        Player player2 = new Player(scanner.nextLine());
    }

}