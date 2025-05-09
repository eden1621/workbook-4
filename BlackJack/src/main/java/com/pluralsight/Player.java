package com.pluralsight;

public class Player {
    private String name;//Name of player
    private Hand hand; //Hand of cards for each player
//create a new player , we set their name and give them new hand
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }
//Player 1 name
    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }
}
