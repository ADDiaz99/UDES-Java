package PasswordMVC;

import java.util.Random;

public class Modelo {
    // Primero generamos un string con un monton de caracteres de donde escoger aleatoriamente
    private String caracteres = "012CDEFGHIJKLMNOPQR3!@#$%^&*()-_+=<>?456abcdefghABCDEFGHIpqrstuvwxyzJKLMNOPQRSTUVWXY@#$%^&*(Zijklmnopqrstuvwxyz789";
    private Random rand = new Random(); // Inicializamos random para generar un numero aleatorio
    
    public String crearPassword(int size) {
        // Usamos stringbuilder para generar un string manipulable por metodos exclusivos de este tipo de dato
        StringBuilder contrasena = new StringBuilder(size); 

        for (int i = size; i > 0; i--) {
            // Selecciona un carácter al azar de los caracteres que estan arriba
            int pos = rand.nextInt(caracteres.length()); // generamos una posicion aleatoria 
            contrasena.append(caracteres.charAt(pos)); // y la agregamos a la contrasena nueva
        }

        return contrasena.toString(); // retornamos con el metodo toString para asegurar el tipo de dato
    }
}