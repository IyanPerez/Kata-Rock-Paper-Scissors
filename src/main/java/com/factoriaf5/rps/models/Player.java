package com.factoriaf5.rps.models;


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
        
        System.out.print("PLAYER: " +  player.getName() + "==> choose your move: ");
    }

    public void playAgainst(Player OtherPlayer) { 
        // Crear las clases figura(piedra, papel, tijera)
        // Crear un metodo para instanciar las respuestas
        if (OtherPlayer.getChoice() == "Scissors") {
            System.out.println("win");
        }
        else if (OtherPlayer.getChoice() == "Paper") {
            System.out.println("lose");
        }
        else 
            System.out.println("tie");
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
