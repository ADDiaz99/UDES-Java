package RegistraduriaMVC;
import javax.swing.JOptionPane;
    
public class Vista {
    
    public void sayHello(){
        JOptionPane.showMessageDialog(null, "Bienvenido al programa Registraduria.\n\n\n\nPresione el boton para Continuar.");
    }
//    public void printCandidate(String candidate){
//        JOptionPane.showMessageDialog(null, "Candidato: " + candidate);
//    }
    
//    public byte requestCandidates(){
//        String candidatos = JOptionPane.showInputDialog(null, "Cuantos candidatos vas a registrar?: ");
//        byte size_c = Byte.parseByte(candidatos);
//        return size_c;
//    }
    
    public String registerCandidate(){
        return JOptionPane.showInputDialog(null, "Nombre y Apellido: ", "Registro de Candidato", JOptionPane.QUESTION_MESSAGE);
    }
    
    public void registerFinished(){
        JOptionPane.showMessageDialog(null, "Registro de Candidatos Finalizado Correctamente.\n\nPresione OK para proceder a la fase de Votacion.","Fase de Registro Finalizada", JOptionPane.PLAIN_MESSAGE);
    }
    
    public void registerSuccessful(String candidate){
        JOptionPane.showMessageDialog(null, "Candidato : " + candidate + " registrado exitosamente.","Registro Exitoso",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void registerFailure(){
        JOptionPane.showMessageDialog(null, "No fue posible registrar el candidato,\nAsegurese de que la informacion este bien digitada.","Registro Fallido",JOptionPane.ERROR_MESSAGE);
    }
    
    public byte requestVoterAmount(){
        boolean isValid = false;
        byte n = 0;
        while(!isValid){
            String input = JOptionPane.showInputDialog(null,"Cuantas personas van a votar en estas elecciones?: ","Solicitud Numero de Votantes", JOptionPane.QUESTION_MESSAGE);
            try{
                n = Byte.parseByte(input);
                isValid = true;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input Invalido, Digite un numero.\n\nErrType: " + e, "ERROR", JOptionPane.WARNING_MESSAGE);
            }   
        }
        return n; 
    }
    
    public int continuar(){
        int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas correr las elecciones de nuevo?"); 
        if (opcion == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Ejecutando de nuevo...");
            return 1;
        }
        else{
            return 0;
        }
    }
}