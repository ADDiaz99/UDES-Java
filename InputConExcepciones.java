import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

// Pedir un numero y validar que no sea una palabra:
public class InputConExcepciones {
    
    public static void main(String[] args) {
        int numero = solicitarNumero();
        System.out.println("El número ingresado es: " + numero);
    }

    public static int solicitarNumero() {
        int numero = 0;
        boolean esValido = false;  // Variable para controlar el ciclo
        while (!esValido) {
            String input = JOptionPane.showInputDialog(null, "Por favor, ingresa un número:");
            try {
                numero = Integer.parseInt(input); // Intenta convertir el input a un número entero
                esValido = true;  // Si la conversión es exitosa, rompe el ciclo
            } catch (NumberFormatException e) {
                // Captura la excepción si el input no es un número válido
                JOptionPane.showMessageDialog(null, "Input inválido. Por favor ingresa un número.");
            }
        }
        return numero;
    }
}

// Pedir una palabra y validar que no sea un número:
public static String solicitarPalabra() {
    String input;
    boolean esValido = false;
    while (!esValido) {
        input = JOptionPane.showInputDialog(null, "Por favor, ingresa una palabra (sin números):");
        if (input.matches(".*\\d.*")) {  // Verifica si contiene números
            JOptionPane.showMessageDialog(null, "Input inválido. No puedes ingresar números.");
        } else {
            esValido = true;
            return input;
        }
    }
    return null;  // Nunca se ejecuta realmente, pero es requerido por el compilador
}

// Pedir un entero y validar que no sea un flotante:
public static int solicitarEntero() {
    int numero = 0;
    boolean esValido = false;
    while (!esValido) {
        String input = JOptionPane.showInputDialog(null, "Por favor, ingresa un número entero:");
        try {
            if (input.contains(".")) {  // Verifica si es un flotante
                throw new NumberFormatException("Número flotante detectado");
            }
            numero = Integer.parseInt(input);  // Intenta convertir a entero
            esValido = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input inválido. Debes ingresar un número entero.");
        }
    }
    return numero;
}

// Pedir un número flotante (double) y validar que no sea un entero:
public static double solicitarFlotante() {
    double numero = 0.0;
    boolean esValido = false;
    while (!esValido) {
        String input = JOptionPane.showInputDialog(null, "Por favor, ingresa un número flotante (con decimales):");
        try {
            numero = Double.parseDouble(input);  // Intenta convertir a double
            if (numero == Math.floor(numero)) {  // Verifica si es un número entero
                throw new NumberFormatException("Número entero detectado");
            }
            esValido = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input inválido. Debes ingresar un número flotante (con decimales).");
        }
    }
    return numero;
}

// Pedir un número dentro de un rango específico:
public static int solicitarNumeroEnRango(int min, int max) {
    int numero = 0;
    boolean esValido = false;
    while (!esValido) {
        String input = JOptionPane.showInputDialog(null, "Ingresa un número entre " + min + " y " + max + ":");
        try {
            numero = Integer.parseInt(input);  // Intenta convertir a entero
            if (numero < min || numero > max) {
                throw new IllegalArgumentException("Número fuera del rango");
            }
            esValido = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input inválido. Debes ingresar un número entero.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Número fuera del rango. Ingresa uno entre " + min + " y " + max + ".");
        }
    }
    return numero;
}


// Pedir una fecha en formato específico y validar que sea correcta
public static String solicitarFecha() {
    String fecha;
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
    formatoFecha.setLenient(false);  // No permite fechas inválidas
    boolean esValido = false;
    while (!esValido) {
        fecha = JOptionPane.showInputDialog(null, "Ingresa una fecha (dd/MM/yyyy):");
        try {
            formatoFecha.parse(fecha);  // Intenta convertir a formato de fecha
            esValido = true;
            return fecha;
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Fecha inválida. Debes seguir el formato dd/MM/yyyy.");
        }
    }
    return null;  // Nunca se ejecuta realmente, pero es requerido por el compilador
}