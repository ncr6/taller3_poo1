

package ejercicio3;
import javax.swing.*;
public class Main {
    
    private static Factura factura1; 
    
         public static void  ingresaDatos(){
         String nombreDelCliente;
        float  cantidadVenta;
        int cantidadVendida;
        nombreDelCliente = JOptionPane.showInputDialog(null, "Nombre y apellidos:", "Datos del cliente", JOptionPane.QUESTION_MESSAGE);
        do {
            cantidadVendida = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad vendida (>=0.0):", "Datos del cliente", 3));
            if(cantidadVendida<0)
                JOptionPane.showMessageDialog(null, "La cantidad vendida debe ser \nmayor o igual que cero", "Datos inválidos", 2);
        }while(cantidadVendida<0);
        do {
            cantidadVenta = Float.parseFloat(JOptionPane.showInputDialog(null, "Cantidad de ventas (>=0.0):", "Datos de los cliente", 3));
            if(cantidadVenta<0)
                JOptionPane.showMessageDialog(null, "La cantidad venta debe ser \nmayor o igual que cero", "Datos inválidos", 2);
        }while(cantidadVenta<0);
        factura1.setNombreDelCliente(nombreDelCliente);
        factura1.setCantidadVendida(cantidadVendida);
        factura1.setCantidadVenta(cantidadVenta);
        
        }
        public static void mostrarResultados(){
              String mensaje = "Los datos del cliente son:\n";
        mensaje = mensaje + factura1.toString();
        mensaje += "\nVenta Bruta: " + factura1.ventaBruta()+ 
                "\nIGV (" + (Factura.IGV * 100) + "%): " + factura1.igv() +
                "\nVenta liquida: " + factura1.ventaLiquida();
        JOptionPane.showMessageDialog(null, mensaje, "Reporte del cliente", 1);
         }
             
              public static void main(String[] args) {
        
                factura1 = new Factura();
         
                 JOptionPane.showMessageDialog(null,"Registro de datos del cliente","Sistema de gestion de facturas",1);
                ingresaDatos();
                 mostrarResultados();
        
                 }
         }

