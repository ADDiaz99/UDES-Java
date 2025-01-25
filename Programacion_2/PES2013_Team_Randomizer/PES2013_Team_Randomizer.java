package Programacion_2.PES2013_Team_Randomizer;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * Randomizador de Equipos para PES 2013
 * @author Andres D. Diaz 22-01-2025
 */
public class PES2013_Team_Randomizer {
    

    public static void main(String[] args) {
        // DEFINICION DE VARIABLES
        Random rand = new Random();
        // SELECCIONES NACIONALES
        String[] africa_nac = {"Argelia", "Angola", "Camerun", "Costa de Marfil", "Egipto", "Ghana", "Guinea", "Mali", "Marruecos", "Nigeria", "Senegal", "Sudafrica", "Tunez", "Zambia"};
        String[] asia_nac = {"Nueva Zelanda", "Arabia Saudita", "Australia", "Catar", "China", "Corea del Norte", "Corea del Sur", "Emiratos Arabes Unidos", "Iran", "Iraq", "Japon", "Jordania", "Kuwait", "Libano", "Oman", "Tailandia", "Uzbekistan"};
        String[] europa_nac = {"Alemania", "Austria", "Belgica", "Bosnia y Herzegovina", "Bulgaria", "Croacia", "Dinamarca", "Escocia", "Eslovaquia", "Eslovenia", "Spain", "Inglaterra", "Finlandia", "Francia", "Gales", "Grecia", "Paises Bajos", "Hungria", "Irlanda", "Irlanda del Norte", "Israel", "Italia", "Montenegro", "Noruega", "Polonia", "Portugal", "Republica Checa", "Rumania", "Rusia", "Serbia", "Suecia", "Suiza", "Turquia", "Ucrania"};
        String[] america_nac = {"Canada", "Costa Rica", "Estados Unidos", "Honduras", "Mexico", "Panama", "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Uruguay", "Venezuela"};
        String[] todos_nac = {"Canada", "Costa Rica", "Estados Unidos", "Honduras", "Mexico", "Panama", "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Uruguay", "Venezuela","Nueva Zelanda", "Arabia Saudita", "Australia", "Catar", "China", "Corea del Norte", "Corea del Sur", "Emiratos Arabes Unidos", "Iran", "Iraq", "Japon", "Jordania", "Kuwait", "Libano", "Oman", "Tailandia", "Uzbekistan","Argelia", "Angola", "Camerun", "Costa de Marfil", "Egipto", "Ghana", "Guinea", "Mali", "Marruecos", "Nigeria", "Senegal", "Sudafrica", "Tunez", "Zambia", "Alemania", "Austria", "Belgica", "Bosnia y Herzegovina", "Bulgaria", "Croacia", "Dinamarca", "Escocia", "Eslovaquia", "Eslovenia", "Spain", "Inglaterra", "Finlandia", "Francia", "Gales", "Grecia", "Paises Bajos", "Hungria", "Irlanda", "Irlanda del Norte", "Israel", "Italia", "Montenegro", "Noruega", "Polonia", "Portugal", "Republica Checa", "Rumania", "Rusia", "Serbia", "Suecia", "Suiza", "Turquia", "Ucrania"};
        // CLUBES
        // Compadre hay 150 clubes licenciados asi que solo agregue los que la 
        // gente de verdad usa, a nadie le importa el Club Chivas de Guadalajara
        String[] libertadores = {"Arsenal (ARG)","Boca Juniors (ARG)","Godoy Cruz (ARG)","Lanus (ARG)","Velez Sarsfield (ARG)","Bolivar (BOL)","The Strongest (BOL)","Real Potosi (BOL)","Corinthians (BRA)","Flamengo (BRA)","Fluminense (BRA)","Internacional (BRA)","Santos (BRA)","Vasco da Gama (BRA)","Union Espanola (CHL)","Universidad de Chile (CHL)","Universidad Catolica (CHL)","Atletico Junior (COL)","Atletico Nacional (COL)","Once Caldas (COL)","Deportivo Quito (ECU)","El Nacional (ECU)","Emelec (ECU)","Cruz Azul (MEX)","Guadalajara (MEX)","Tigres (MEX)","Libertad (PAR)","Nacional (PAR)","Olimpia (PAR)","Alianza Lima (PER)","Juan Aurich (PER)","Sport Huancayo (PER)","Defensor Sporting (URU)","Nacional (URU)","Penarol (URU)","Caracas (VEN)","Deportivo Tachira (VEN)","Zamora (VEN)"};
        String[] champions = {"Bayern Munich (GER)","Schalke 04 (GER)","RSC Anderlecht (BEL)","Club Brujas (BEL)","Dinamo Zagreb (CRO)","Copenhague (DEN)","Nordsjaelland (DEN)","Celtic FC (SCO)","Motherwell FC (SCO)","Barcelona (ESP)","Malaga (ESP)","Real Madrid (ESP)","Valencia (ESP)","LOSC Lille (FRA)","Montpellier (FRA)","Paris Saint-Germain (FRA)","Olympiacos FC (GRE)","Panathinaikos FC (GRE)","Manchester United (ENG)","Juventus (ITA)","Milan (ITA)","Udinese (ITA)","Ajax (NED)","Feyenoord (NED)","Benfica (POR)","Braga (POR)","Porto (POR)","CFR Cluj (ROM)","Spartak de Moscu (RUS)","Zenit San Petesburgo (RUS)","Fenerbahce SK (TUR)","Galatasaray SK (TUR)","Shakhtar Donetsk (UCR)","Dinamo de Kyiv (UCR)"};
        String[] todos_clubes = {"Bayern Munich (GER)","Schalke 04 (GER)","RSC Anderlecht (BEL)","Club Brujas (BEL)","Dinamo Zagreb (CRO)","Copenhague (DEN)","Nordsjaelland (DEN)","Celtic FC (SCO)","Motherwell FC (SCO)","Barcelona (ESP)","Malaga (ESP)","Real Madrid (ESP)","Valencia (ESP)","LOSC Lille (FRA)","Montpellier (FRA)","Paris Saint-Germain (FRA)","Olympiacos FC (GRE)","Panathinaikos FC (GRE)","Manchester United (ENG)","Juventus (ITA)","Milan (ITA)","Udinese (ITA)","Ajax (NED)","Feyenoord (NED)","Benfica (POR)","Braga (POR)","Porto (POR)","CFR Cluj (ROM)","Spartak de Moscu (RUS)","Zenit San Petesburgo (RUS)","Fenerbahce SK (TUR)","Galatasaray SK (TUR)","Shakhtar Donetsk (UCR)","Dinamo de Kyiv (UCR)","Arsenal (ARG)","Boca Juniors (ARG)","Godoy Cruz (ARG)","Lanus (ARG)","Velez Sarsfield (ARG)","Bolivar (BOL)","The Strongest (BOL)","Real Potosi (BOL)","Corinthians (BRA)","Flamengo (BRA)","Fluminense (BRA)","Internacional (BRA)","Santos (BRA)","Vasco da Gama (BRA)","Union Espanola (CHL)","Universidad de Chile (CHL)","Universidad Catolica (CHL)","Atletico Junior (COL)","Atletico Nacional (COL)","Once Caldas (COL)","Deportivo Quito (ECU)","El Nacional (ECU)","Emelec (ECU)","Cruz Azul (MEX)","Guadalajara (MEX)","Tigres (MEX)","Libertad (PAR)","Nacional (PAR)","Olimpia (PAR)","Alianza Lima (PER)","Juan Aurich (PER)","Sport Huancayo (PER)","Defensor Sporting (URU)","Nacional (URU)","Penarol (URU)","Caracas (VEN)","Deportivo Tachira (VEN)","Zamora (VEN)"};    
        ArrayList<String> seleccionados = new ArrayList<>();
        
        //LOGICA EN CONSOLA
        /* 2 Equipos
        for(int i = 0; i<2; i++){
            int n = rand.nextInt(todos_nac.length);
            seleccionados.add(todos_nac[n]);
        }
        System.out.println(seleccionados.get(0)+ " VS " + seleccionados.get(1));
        */
        
        // ENTORNO GRAFICO
        sayHello();
        boolean stopAsking = false;
        while(!stopAsking){
            int decision = requestLeague();
            switch(decision){
                case 0:
                    seleccionados = getTeams(africa_nac);
                    break;
                case 1:
                    seleccionados = getTeams(asia_nac);
                    break;
                case 2:
                    seleccionados = getTeams(europa_nac);
                    break;
                case 3:
                    seleccionados = getTeams(america_nac);
                    break;
                case 4:
                    seleccionados = getTeams(todos_nac);
                    break;
                case 5:
                    seleccionados = getTeams(libertadores);
                    break;
                case 6:
                    seleccionados = getTeams(champions);
                    break;
                case 7:
                    seleccionados = getTeams(todos_clubes);
                    break;
                default:
                    showError();
            }

            stopAsking = showMatchups(seleccionados);
            
        }
        
        
    }
    
    // CREACION DE FUNCIONES
    public static void sayHello(){
        ImageIcon logo  = new ImageIcon(PES2013_Team_Randomizer.class.getResource("/logo_pes.png"));
        JOptionPane.showMessageDialog(null, 
                "Este programa te permite formar equipos totalmente aleatorios " +
                "con el fin de garantizar la experiencia competitiva mas justa posible."
                + "\nSimplemente selecciona la liga que deseas y se generara 8 contiendas completamente aleatorias.", 
                "PES 2013 Team Randomizer", 
                0, logo);
    }
    
    public static int requestLeague(){
        String [] options = {"Africa", "Asia", "Europa", "America", "Mundial", "Copa Libertadores", "UEFA Champions", "Todos los Clubes"};
        boolean isValid = false;
        int n = 0;
        n = JOptionPane.showOptionDialog(null, "Selecciona la liga a generar.", "Seleccion de Liga", 0, JOptionPane.QUESTION_MESSAGE, null, options, 0);
        if(n == -1){
            System.exit(0);
        }
        return n;
    }
    
    public static ArrayList<String> getTeams(String[] input){
        Random random = new Random();
        ArrayList<String> teams = new ArrayList<>();
        
//      One way to do it:
//
//        while (teams.size() < 8) {
//            int n = random.nextInt(input.length);
//            if (!teams.contains(input[n])) { // Verifica directamente si no está en la lista
//                teams.add(input[n]);
//            }
//        }

        for(int i = 0; i < 8; i++){
            boolean isRepeated = true;
            
            while(isRepeated){
                int n = random.nextInt(input.length);
                int similarities = 0;
                
                for(int j = 0; j < teams.size(); j++){
                    if(input[n].equals(teams.get(j))){
                        similarities++;
                    }
                }
                
                if(similarities == 0){
                    teams.add(input[n]);
                    isRepeated = false;
                }
                else{
                    isRepeated = true;
                }
            }
        }
        return teams;
    }
    
    public static void showError(){
        JOptionPane.showMessageDialog(null, "ERROR: Input no valido\nReinicie el programa.", "Error en la aplicacion", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
    
    public static boolean showMatchups(ArrayList<String> teams){
        String [] options = {"Generar Nuevo MatchUp", "Salir del Programa"};
        boolean isValid = false;
        int n = 0;
        String msg ="\n" + teams.get(0) + " VS " + teams.get(1) + "\n" + teams.get(2) + " VS " + teams.get(3) + "\n" +teams.get(4) + " VS " + teams.get(5) + "\n" + teams.get(6) + " VS " + teams.get(7) + "\n";
        n = JOptionPane.showOptionDialog(null, msg, "MatchUp Generado", 0, JOptionPane.INFORMATION_MESSAGE, null, options, 0);
        if(n == -1){
            System.exit(0);
        }
        if (n == 0){
            return false;
        }
        else{
            return true;
        }
    }
}
