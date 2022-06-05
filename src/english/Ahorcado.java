/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package english;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Ahorcado {

    private int numVidas = 15;
    private Frases f;
    private String frase;
    private char[] copia;
    private char[] desguazada;
    private char[] respuestas;
    static Scanner sc = new Scanner(System.in);

    public Ahorcado() {
        f = new Frases();
        frase = f.getFrase();
    }

    public void juego() {
        preparacion();
        while (!Arrays.equals(desguazada, copia) ) {
            
            play();
            if(numVidas==0){
                break;
            }
            mostrarTabla();
        }
        if(Arrays.equals(copia, desguazada)){
            System.out.println("-------------------------\n"+f.getTranslation());
        }
        
        
    }

    private void preparacion() {
        desguazada = frase.toCharArray();
        copia = frase.toCharArray();

        respuestas = new char[desguazada.length];

        for (int i = 0; i < respuestas.length; i++) {
            copia[i] = '_';
        }
        relleno();
        mostrarTabla();
    }

    private void relleno() {
        for (int i = 0; i < respuestas.length; i++) {
            switch (desguazada[i]) {
                case ' ':
                    copia[i] = ' ';
                    break;
                case ',':
                    copia[i] = ',';
                    break;
                case '\'':
                    copia[i]='\'';
                    break;
                default:
                    break;
            }
            
        }
    }

    private void mostrarTabla() {
        for (int i = 0; i < respuestas.length; i++) {
            System.out.print(copia[i]);
        }
        System.out.println("\n");
    }

    private void play() {
        boolean fallo = false;
        System.out.println("numVidas: " + numVidas);
        System.out.print("Escoje una letra: ");
        char cod = sc.next().charAt(0);
        for (int i = 0; i < respuestas.length; i++) {
            if (desguazada[i] == cod) {
                copia[i] = cod;
                fallo = false;
            } else {
                fallo = true;
            }
        }
        if (fallo) {
            numVidas--;
        }
    }

}
