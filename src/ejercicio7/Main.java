package ejercicio7;
import javax.swing.JOptionPane;

public class Main {
    
    public static boolean confirmar(String pregunta){
        boolean confirmado = false;
        int resultado = JOptionPane.showConfirmDialog(null, pregunta, "Confirmación", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION){
            confirmado = true;
        } else if (resultado == JOptionPane.NO_OPTION){
            confirmado = false;
        }
        return confirmado;
    }
    
    public static void main(String[] args) {
        float tasa, saldo;
        boolean continuar = true;
        
        JOptionPane.showMessageDialog(null, "Este programa calcula los intereses de una cuenta de ahorros", "Bienvenido", 1);
        
        tasa = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la tasa de interés para todas las cuentas:", "Tasa de interés",3));
        CuentaAhorro.setTasa(tasa);
        
        do{
            saldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el saldo de la cuenta de ahorros:", "Ingrese el saldo", 3));
            CuentaAhorro c1 = new CuentaAhorro(saldo);
            JOptionPane.showMessageDialog(null,c1.toString(),"Información de la cuenta",1);
            continuar = confirmar("¿Desea ver la información de otra cuenta?");
        } while (continuar);
        
        JOptionPane.showMessageDialog(null, "Gracias por usar este programa", "Hasta luego", 1);
    }
}
