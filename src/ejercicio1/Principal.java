/*
 * Clase que permite capturar los datos de un trabajador y luego mostrar los cálculos realizados.
 */
package ejercicio1;

import javax.swing.*;

/**
 *
 * @author Zoraida Vidal
 */
public class Principal {
    private static Trabajador t1;
    
    public static void ingresaDatos() {
        String nombre;
        float salarioPorHora, horasLaboradas;
        nombre = JOptionPane.showInputDialog(null, "Nombre y apellidos:", "Datos del trabajador", JOptionPane.QUESTION_MESSAGE);
        do {
            salarioPorHora = Float.parseFloat(JOptionPane.showInputDialog(null, "Salario por hora (>=0.0):", "Datos del trabajador", 3));
            if(salarioPorHora<0)
                JOptionPane.showMessageDialog(null, "El salario por hora debe ser \nmayor o igual que cero", "Mensaje", 2);
        }while(salarioPorHora<0);
        do {
            horasLaboradas = Float.parseFloat(JOptionPane.showInputDialog(null, "Horas laboradas (>=0.0):", "Datos del trabajador", 3));
            if(horasLaboradas<0)
                JOptionPane.showMessageDialog(null, "El número de horas laboradas debe ser \nmayor o igual que cero", "Mensaje", 2);
        }while(horasLaboradas<0);       
        t1.setNombre(nombre);
        t1.setSalarioPorHora(salarioPorHora);
        t1.setHorasLaboradas(horasLaboradas);
    }
    
    public static void mostrarResultados() {
        String mensaje = "Los datos del trabajador son:\n";
        mensaje = mensaje + t1.toString();
        mensaje += "\nSueldo bruto: " + t1.getSueldoBruto() + 
                "\nDescuento (" + (Trabajador.DSCTO * 100) + "%): " + t1.getMontoDeDescuento() +
                "\nSueldo neto: " + t1.getSueldoNeto();
        JOptionPane.showMessageDialog(null, mensaje, "Reporte de datos del trabajador", 1);
    }
            
    public static void main(String[] args) {
        t1 = new Trabajador();
        JOptionPane.showMessageDialog(null, "Registro de datos de trabajadores", "Sistema de Gestión de Trabajadores", 1);
        ingresaDatos();
        mostrarResultados();
    }    
}