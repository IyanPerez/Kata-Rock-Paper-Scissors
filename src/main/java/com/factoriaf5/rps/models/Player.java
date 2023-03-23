package com.factoriaf5.rps.models;
import java.util.Scanner;

public class Player {

    private String name;
    private String choice;


    public Player(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    public Player() {
    }
    

    public Player(String name) {
        this.name = name;
    }

    public void movementSelection(Player player) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("PLAYER: " +  player.getName() + "==> choose your move: ");
        String input1 = scanner.nextLine();
        
        player.setChoice(input1);
        System.gc();
        // scanner.close();
    }

    public void playAgainst(Player OtherPlayer) {
        if (OtherPlayer.getChoice() == "Scissors") {
            System.out.println("win");
        }
        else if (OtherPlayer.getChoice() == "Paper") {
            System.out.println("lose");
        }
        else 
            System.out.println("prueba");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }





    

}
