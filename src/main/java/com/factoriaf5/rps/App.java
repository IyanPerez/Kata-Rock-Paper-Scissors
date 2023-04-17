package com.factoriaf5.rps;

import com.factoriaf5.rps.models.Player;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    { 
        Player player1 = new Player ("Rulo");
        Player player2 = new Player ("Curro");

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        
        player1.movementSelection(player1);
        String input1 = scanner1.nextLine();
        player1.setChoice(input1);
        scanner1.close();
        
        // crear un metodo para usarlo siempre que quiera preguntar
        
        player2.movementSelection(player2);
        String input2 = scanner2.nextLine(); 
        player2.setChoice(input2);
        scanner2.close();


        System.out.println(player1.getChoice());
        System.out.println(player2.getChoice());
        // Game1.round(player1, player2);

        player1.playAgainst(player2);


    }
}
