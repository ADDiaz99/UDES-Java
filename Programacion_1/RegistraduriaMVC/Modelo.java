package RegistraduriaMVC;

import javax.swing.JOptionPane;
// Modelo
public class Modelo {
    private Vista vista;
    public Modelo(Vista vista) {
        this.vista = vista;
    }
    private byte size;
    private String[] candidatos;
    private byte votos[];
    private byte votantes;
    private byte max;
    
    public void startProcess(){
        size = 3;
        candidatos = new String[size + 1]; // El size mas uno para generar un espacio para el boton de salir
        String ganador = "";
        for (int i = 0; i < size; i++){
            candidatos[i] = vista.registerCandidate();
            vista.registerSuccessful(candidatos[i]);
        }
        candidatos[size] = "Salir";
        vista.registerFinished(); //Fin Fase de Registro
        
        votos = new byte[size];   //Comienza Fase de Votacion
        //0 = primer candidato, 1 = segundo candidato, 3 = tercer candidato
        votos[0] = 0; votos[1] = 0; votos[2] = 0;
        votantes = vista.requestVoterAmount();
        byte intentos = votantes;
        
        while (intentos > 0) {
            int opcion = JOptionPane.showOptionDialog(
            null,
            "¿Por cual candidato vas a votar? " + "\t\t\t Votos Restantes: " + intentos,
            "Fase de Votacion",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            candidatos,
            candidatos[0]);
            if (opcion == candidatos.length - 1) { // Si se selecciona "Salir"
            break;
            }
            try {
            switch (opcion) {
            case 0: votos[0]++; intentos--;
            break;
            case 1: votos[1]++; intentos--;
            break;
            case 2: votos[2]++; intentos--;
            break;
            }
            } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos.");
            } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } // Fin ciclo while
        max = 0;
        for (int i = 0; i < size; i++){
            if(votos[i] > max){
                max = votos[i];
                ganador = candidatos[i];
            }
        }
        // TODO: Verificar empates, y hacer excepciones en todos los inputs
        JOptionPane.showMessageDialog(null, "El ganador es: " + ganador + "\n\nCantidad de votos: " + max + "\nDe un total de: " + votantes + " electores.", "Fin de las Elecciones", JOptionPane.PLAIN_MESSAGE);
    }    
}