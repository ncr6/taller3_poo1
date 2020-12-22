package ejercicio5;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //instanciando objeto de tiempo con hora 10:15:59 AM
        MiTiempo tiempo1 = new MiTiempo(10,15,59,false);
        //mostrando datos
        JOptionPane.showMessageDialog(null, "La hora del objeto tiempo1 es:\n"+tiempo1.toString(), "Hora de tiempo1", 1);
        //incrementando hora en 1s
        tiempo1.incrementarSegundo();
        //mostrando datos
        JOptionPane.showMessageDialog(null, "La hora del objeto tiempo1 (+1s) es:\n"+tiempo1.toString(), "Hora incrementada de tiempo1", 1);
        
        //instanciando objeto de tiempo con hora 3:59:00 PM
        MiTiempo tiempo2 = new MiTiempo(3,59,0,true);
        JOptionPane.showMessageDialog(null, "La hora del objeto tiempo2 es:\n"+tiempo2.toString(), "Hora de tiempo2", 1);
        tiempo2.incrementarMinuto();
        JOptionPane.showMessageDialog(null, "La hora del objeto tiempo2 (+1 min) es:\n"+tiempo2.toString(), "Hora incrementada de tiempo2", 1);
        
        //instanciando objeto de tiempo con hora 11:00:00 PM
        MiTiempo tiempo3 = new MiTiempo(11,0,0,true);
        JOptionPane.showMessageDialog(null, "La hora del objeto tiempo3 es:\n"+tiempo3.toString(), "Hora de tiempo3", 1);
        tiempo3.incrementarHora();
        JOptionPane.showMessageDialog(null, "La hora del objeto tiempo3 (+1 hr) es:\n"+tiempo3.toString(), "Hora incrementada de tiempo3", 1);
    
        //instanciando objeto de tiempo con hora 11:59:59 PM
        MiTiempo tiempo4 = new MiTiempo(11,59,59,true);
        JOptionPane.showMessageDialog(null, "La hora del objeto tiempo4 es:\n"+tiempo4.toString(), "Hora de tiempo4", 1);
        tiempo4.incrementarSegundo();
        JOptionPane.showMessageDialog(null, "La hora del objeto tiempo4 (+1s) es:\n"+tiempo4.toString(), "Hora incrementada de tiempo4", 1);
    }
}
