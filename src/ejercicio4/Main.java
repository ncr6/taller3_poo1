package ejercicio4;
import javax.swing.JOptionPane;

public class Main {
    public static void showFechas(MiFecha fecha){
        String mensaje = "Formatos de fecha disponibles:\n";
        mensaje += ("MM/DD/AA: " + fecha.getFechaMMDDAA() + "\n");
        mensaje += ("DD/MM/AA: " + fecha.getFechaDDMMAA() + "\n");
        mensaje += ("Mes Día, AAAA: " + fecha.getFechaMLDA() + "\n");
        mensaje += ("Mes AAAA: " + fecha.getFechaMLA() + "\n");
        JOptionPane.showMessageDialog(null, mensaje, "Fecha en diferentes formatos", 1);
    }
    public static void main(String[] args) {
        // instanciando objetos MiFecha con metodos sobrecargados
        MiFecha fecha1 = new MiFecha(12, 21, 2020, true);
        MiFecha fecha2 = new MiFecha(13, 6, 2003, false);
        MiFecha fecha3 = new MiFecha("Julio", 10, 1971);
        MiFecha fecha4 = new MiFecha("Noviembre", 2018);
        
        showFechas(fecha1);
        showFechas(fecha2);
        showFechas(fecha3);
        showFechas(fecha4);
        
    }
    
}
