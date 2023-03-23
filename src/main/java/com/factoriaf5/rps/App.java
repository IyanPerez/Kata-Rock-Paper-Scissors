package com.factoriaf5.rps;

import com.factoriaf5.rps.application.Game;
import com.factoriaf5.rps.models.Player;

public class App 
{
    public static void main( String[] args )
    { 
        Player player1 = new Player ("Rulo");
        Player player2 = new Player ("Curro");
        Game Game1 = new Game();

        player1.movementSelection(player1);
        player2.movementSelection(player2);

        System.out.println(player1.getChoice());
        System.out.println(player2.getChoice());
        // Game1.round(player1, player2);

        player1.playAgainst(player2);

        System.out.println(player1.getChoice());
        System.out.println(player2.getChoice());

    }
}
