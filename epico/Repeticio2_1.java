package epico;

import java.util.*;

public class Repeticio2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generador = new Random();
        int punts_jug = 0;
        int punts_ord = 0;
        
        int victoria = 0;
        // Aqui s'agafan els numeros del jugador (input) i de l'ordinador (random)
        while (victoria != 1) { 
            int num1 = generador.nextInt(3);
            System.out.println("Digues un nombre compost entre els numeros 0 i  2 (0 = pedra, 1 = paper, 2 = tisores)");
            int num2 = input.nextInt();
            System.out.print("Numero del ordinador: ");
            System.out.println(num1);  
            System.out.print("Numero del jugador: ");
            System.out.println(num2);
            System.out.println();
            // Aqui surten tots els resultats possibles, es mes facil de fer perque els numeros son del 0 al 2
            if (num1 == 0 && num2 == 0) {
                System.out.println("Empat per pedra.");
            }
            else if (num1 == 0 && num2 == 1) {
                System.out.println("Jugador ha tret paper i guanya contra la pedra de l'ordinador");
                punts_jug++;
            }
            else if (num1 == 0 && num2 == 2) {
                System.out.println("L'ordinador ha tret pedra i guanya contra les tisores del jugador");
                punts_ord++;
            }
            else if (num1 == 1 && num2 == 0) {
                System.out.println("Ordinador ha tret paper i guanya contra la pedra del jugador");
                punts_ord++;
            }
            else if (num1 == 1 && num2 == 1) {
                System.out.println("Empat per paper.");
            }
            else if (num1 == 1 && num2 == 2) {
                System.out.println("Jugador ha tret tisores i guanya contra el paper del ordinador");
                punts_jug++;
            }
            else if (num1 == 2 && num2 == 0) {
                System.out.println("Jugador ha tret pedra i guanya contra les tisores del ordinador");
                punts_jug++;
            }
            else if (num1 == 2 && num2 == 1) {
                System.out.println("Ordinador ha tret tisores i guanya contra el paper del jugador");
                punts_ord++;
            }
            else if (num1 == 2 && num2 == 2) {
                System.out.println("Empat per tisores.");
            }
            
            if (punts_jug == 3) {
                System.out.println("Jugador ha guanyat 3 vegades, enhorabona!");
                victoria = 1;
            }
            else if (punts_ord == 3) {
                System.out.println("Ordinador ha guanyat 3 vegades, enhorabona!");
                victoria = 1;
            }
        }
    }
}