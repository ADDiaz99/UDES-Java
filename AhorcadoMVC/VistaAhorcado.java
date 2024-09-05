/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhorcadoMVC;

import java.util.Scanner;

public class VistaAhorcado {
    private Scanner scanner;

    public VistaAhorcado() {
        scanner = new Scanner(System.in);
    }

    public void mostrarEstado(JuegoAhorcado juego) {
        System.out.println("\nLetras adivinadas: " + juego.getLetrasAdivinadas() + "/" + juego.getPalabraSecreta().length());
        System.out.println("Intentos Restantes: " + juego.getIntentosRestantes());
        System.out.println("Palabra: " + juego.getPalabraGuion());
    }

    public char obtenerLetra() {
        System.out.print("Que letra vas a intentar?: ");
        return scanner.next().toLowerCase().charAt(0);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

