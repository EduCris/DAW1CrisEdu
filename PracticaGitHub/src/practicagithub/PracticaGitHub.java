package practicagithub;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sandiecr
 */
public class PracticaGitHub {



    public static void main(String[] args) throws IOException {
        int[] players = new int[30];
        int i, j, k=0, aux;
        System.out.println("Dorsal del jugador y canastas anotadas");
        System.out.println();
        for (i = 0; i < players.length; i++) {
            players[i] = (int) (Math.random() * 100);
            System.out.print("Dorsal " + (i + 1) + " Canastas " + players[i]);
            System.out.println("");
        }
        System.out.println("Ranking de los 10 jugadores con mas canastas");
        int[] MejJug = new int[10];
        int[] jugAux = new int[30];
        int pasada;
        boolean hecho = true;
        for (j = 0, i = 0; j < jugAux.length; j++, i++) {
            jugAux[j] = players[i];
        }
        while (k < jugAux.length && hecho == true) {
            hecho=false;
            for (pasada = 0; pasada < jugAux.length - 1; pasada++) {
                for (j = 0; j < jugAux.length; j++) {
                   aux=jugAux[j];
                   jugAux[j]=jugAux[j+1];
                   jugAux[j+1]=aux;
                   hecho=true;
                }
            }k++;
        } for(j=0;j<jugAux.length;j++){
            System.out.println(" "+jugAux[j]);
        }
        for(j=0;j<10;j++){
            System.out.println("Dorsal " + j + " Canastas " + players[j]);
        }
    }
}
