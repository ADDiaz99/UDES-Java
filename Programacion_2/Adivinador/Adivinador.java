package Programacion_2.Adivinador;
/**
 *
 * @author Andres D. Diaz 16-01-2025
 */
public class Adivinador {

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.start();
    }
}

/*
Crea un programa en Java utilizando MVC e interfaz Grafica donde el usuario deba 
adivinar un número generado aleatoriamente por la computadora. 
El juego debe incluir las siguientes características:

    - El programa debe generar un número aleatorio entre 1 y 100.
    - El usuario tiene un límite de intentos (por ejemplo, 5 intentos).
    - Después de cada intento, el programa debe informar si el número ingresado es:
        Mayor que el número objetivo.
        Menor que el número objetivo.
        Correcto.

    - Si el usuario adivina el número, el programa debe mostrar un mensaje de felicitación.
    - Si el usuario no lo logra después de los intentos permitidos, el programa debe mostrar
      un mensaje indicando cuál era el número correcto.
    - Implementa una opción para que el usuario decida si quiere jugar nuevamente.
    
    Extras para hacerlo más interesante (opcional):
    - Llevar un registro de puntajes, donde cada intento exitoso otorga puntos.
    - Cambiar el rango del número aleatorio según el nivel de dificultad que elija el usuario.
*/
