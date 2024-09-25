package RegistraduriaMVC;

public class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int continuar;    // Para preguntar si queremos ejecutar de nuevo
        
        do{
        vista.sayHello(); // Saludamos al usuario
        modelo.startProcess(); // Iniciamos el modelo
        
        continuar = vista.continuar();  // Preguntamos si quiere continuar
        }
        while(continuar == 1);
    }
}
