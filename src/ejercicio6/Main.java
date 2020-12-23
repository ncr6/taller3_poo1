package ejercicio6;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        MiFechaModificada fecha1 = new MiFechaModificada(29,2,2020);
        
        String mensaje = "La fecha 1 es: " + fecha1.getFechaDDMMAA();
        JOptionPane.showMessageDialog(null, mensaje, "Fecha 1", 1);
        
        fecha1.siguienteDia();
        
        mensaje = "La fecha 1 incrementada en 1 día es:\n" + fecha1.getFechaDDMMAA();
        JOptionPane.showMessageDialog(null, mensaje, "Fecha 1 (incrementada)", 1);
        
        MiFechaModificada fecha2 = new MiFechaModificada(22,12,2020);
        
        mensaje = "La fecha 2 es: " + fecha2.getFechaDDMMAA();
        JOptionPane.showMessageDialog(null, mensaje, "Fecha 2", 1);
        
        fecha2.siguienteMes();
        
        mensaje = "La fecha 2 incrementada en 1 mes es:\n" + fecha2.getFechaDDMMAA();
        JOptionPane.showMessageDialog(null, mensaje, "Fecha 2 (incrementada)", 1);
    }
}
