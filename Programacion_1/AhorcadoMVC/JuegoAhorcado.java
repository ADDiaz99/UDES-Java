/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhorcadoMVC;
import java.util.Random;

public class JuegoAhorcado {
    private String palabraSecreta;
    private StringBuilder palabraGuion;
    private int letrasAdivinadas;
    private int intentosRestantes;

    public JuegoAhorcado() {
        String[] palabras = {"udes", "piano", "control", "audifonos", "apartamento", "teclado"};
        Random rand = new Random();
        this.palabraSecreta = palabras[rand.nextInt(palabras.length)];
        this.palabraGuion = new StringBuilder("_".repeat(palabraSecreta.length()));
        this.letrasAdivinadas = 0;
        this.intentosRestantes = 5;
    }

    public String getPalabraGuion() {
        return palabraGuion.toString();
    }

    public int getLetrasAdivinadas() {
        return letrasAdivinadas;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public boolean adivinarLetra(char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraGuion.setCharAt(i, letra);
                letrasAdivinadas++;
                acierto = true;
            }
        }
        if (!acierto) {
            intentosRestantes--;
        }
        return acierto;
    }

    public boolean esJuegoGanado() {
        return letrasAdivinadas == palabraSecreta.length();
    }

    public boolean esJuegoPerdido() {
        return intentosRestantes <= 0;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }
}
