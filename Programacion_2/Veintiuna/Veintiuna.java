package Programacion_2.Veintiuna;

public class Veintiuna {

    public static void main(String[] args) {
        // Ejecutar todos los files
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        
        Controlador controlador = new Controlador(modelo, vista);
        controlador.start();
    }
}
