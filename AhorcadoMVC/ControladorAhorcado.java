/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AhorcadoMVC;

public class ControladorAhorcado {
    private JuegoAhorcado juego;
    private VistaAhorcado vista;

    public ControladorAhorcado(JuegoAhorcado juego, VistaAhorcado vista) {
        this.juego = juego;
        this.vista = vista;
    }

    public void iniciarJuego() {
        while (!juego.esJuegoGanado() && !juego.esJuegoPerdido()) {
            vista.mostrarEstado(juego);
            char letra = vista.obtenerLetra();
            boolean acierto = juego.adivinarLetra(letra);
            if (!acierto) {
                vista.mostrarMensaje("Esa letra no está en la palabra!");
            }
        }
        if (juego.esJuegoGanado()) {
            vista.mostrarMensaje("Felicidades! Has adivinado la palabra: " + juego.getPalabraSecreta());
        } else {
            vista.mostrarMensaje("Perdiste el juego. La palabra era: " + juego.getPalabraSecreta());
        }
    }
}
