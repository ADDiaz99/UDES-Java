/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package AhorcadoMVC;

public class Practica_mvc {
    public static void main(String[] args) {
        JuegoAhorcado juego = new JuegoAhorcado();
        VistaAhorcado vista = new VistaAhorcado();
        ControladorAhorcado controlador = new ControladorAhorcado(juego, vista);
        
        controlador.iniciarJuego();
    }
}
