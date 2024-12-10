package epico;

import java.util.*;

public class Repeticio2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generador = new Random();
        int punts_jug = 0;
        int punts_ord = 0;
        
        int victoria = 0;
        
        while (victoria != 1) { 
            int num1 = generador.nextInt(3);
            System.out.println("Input a number between 0 and 2 (0 = rock, 1 = paper, 2 = scissors)");
            int num2 = input.nextInt();
            System.out.print("Computer's number: ");
            System.out.println(num1);  
            System.out.print("Player's number: ");
            System.out.println(num2);
            System.out.println();

            if (num1 == 0 && num2 == 0) {
                System.out.println("Both played rock. Tie.");
            }
            else if (num1 == 0 && num2 == 1) {
                System.out.println("Player played paper, computer played rock. Player wins.");
                punts_jug++;
            }
            else if (num1 == 0 && num2 == 2) {
                System.out.println("Computer played rock, player played scissors. Computer wins.");
                punts_ord++;
            }
            else if (num1 == 1 && num2 == 0) {
                System.out.println("Computer played paper, player played rock. Computer wins.");
                punts_ord++;
            }
            else if (num1 == 1 && num2 == 1) {
                System.out.println("Both played paper. Tie.");
            }
            else if (num1 == 1 && num2 == 2) {
                System.out.println("Player played scissors, computer played paper. Player wins.");
                punts_jug++;
            }
            else if (num1 == 2 && num2 == 0) {
                System.out.println("Player played rock, computer played scissors. Player wins.");
                punts_jug++;
            }
            else if (num1 == 2 && num2 == 1) {
                System.out.println("Computer played scissors, player played paper. Computer wins.");
                punts_ord++;
            }
            else if (num1 == 2 && num2 == 2) {
                System.out.println("Both played scissors. Tie.");
            }
            
            if (punts_jug == 3) {
                System.out.println("Player has won 3 times, congratulations!");
                victoria = 1;
            }
            else if (punts_ord == 3) {
                System.out.println("Computer has won 3 times, congratulations!");
                victoria = 1;
            }
        }
    }
}