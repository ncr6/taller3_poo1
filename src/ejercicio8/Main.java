// Clase principal que realiza la entrada y salida de datos de las fracciones

package ejercicio8;
import javax.swing.JOptionPane;

public class Main {
    public static int menu(){
        int opcion;
        String mensajeMenu = "Seleccione una opcion del menú:" +
                             "\n1. Sumar fracciones"+
                             "\n2. Restar fracciones"+
                             "\n3. Multiplicar fracciones."+
                             "\n4. Dividir fracciones."+
                             "\n5. Mostrar fracciones ingresadas"+
                             "\n6. Mostrar fracciones de manera decimal."+
                             "\n7. Salir."+
                             "\nIngrese su opción:";
        String mensajeInvalido = "La opción ingresada no es válida.\nPor favor inténtelo nuevamente.";
        
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensajeMenu, "Menú principal", 1));
            if (opcion<1 || opcion>7){
                JOptionPane.showMessageDialog(null, mensajeInvalido, "Opción inválida", 0);
            }
        } while (opcion<1 || opcion>7);
        
        return opcion;
    }
    
   public static boolean confirmarSesion(){
        boolean confirmado = false;
        int resultado = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION){
            confirmado = true;
        } else if (resultado == JOptionPane.NO_OPTION){
            confirmado = false;
        }
        return confirmado;
    }
    
    public static void main(String[] args) {
        int opc;
        boolean continuar = true;
        int[] resultados;
        
        MiFraccion frac1 = new MiFraccion();
        MiFraccion frac2 = new MiFraccion();
        MiFraccion fracResult = new MiFraccion();
        
        JOptionPane.showMessageDialog(null, "Este programa realiza aritmética de fracciones", "Bienvenido", 1);
        
        do{
            opc = menu();
            switch (opc){
                case 1 -> {
                    frac1.ingresarValores("Datos de la primera fracción");
                    frac2.ingresarValores("Datos de la segunda fracción");
                    resultados = frac1.sumarConFraccion(frac2);
                    fracResult.setFraccionSimplificar(resultados);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma de fracciones es:\n"+fracResult.toString(), "Resultado", 1);
                    continuar = confirmarSesion(); break;
                }
                case 2 -> {
                    frac1.ingresarValores("Datos de la primera fracción");
                    frac2.ingresarValores("Datos de la segunda fracción");
                    resultados = frac1.restarConFraccion(frac2);
                    fracResult.setFraccionSimplificar(resultados);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma de fracciones es:\n"+fracResult.toString(), "Resultado", 1);
                    continuar = confirmarSesion(); break;
                }
                case 3 -> {
                    frac1.ingresarValores("Datos de la primera fracción");
                    frac2.ingresarValores("Datos de la segunda fracción");
                    resultados = frac1.multiplicarConFraccion(frac2);
                    fracResult.setFraccionSimplificar(resultados);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma de fracciones es:\n"+fracResult.toString(), "Resultado", 1);
                    continuar = confirmarSesion(); break;             
                }
                case 4 -> {
                    frac1.ingresarValores("Datos de la primera fracción");
                    frac2.ingresarValores("Datos de la segunda fracción");
                    resultados = frac1.dividirConFraccion(frac2);
                    fracResult.setFraccionSimplificar(resultados);
                    JOptionPane.showMessageDialog(null, "El resultado de la suma de fracciones es:\n"+fracResult.toString(), "Resultado", 1);
                    continuar = confirmarSesion(); break;                
                }
                case 5 -> {
                    if (!frac1.toString().equals("(vacío)")){
                        String mensaje = "Las fracciones almacenadas son:\n"+ frac1.toString() +
                                         "\n" + frac2.toString() + "\n" + fracResult.toString();
                        JOptionPane.showMessageDialog(null, mensaje, "Historial de fracciones", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Todavía no se ha almacenado ninguna fracción", "Historial de fracciones vacío", 2);
                    }
                    continuar = confirmarSesion(); break;
                }
                case 6 -> {
                    if (!frac1.toString().equals("(vacío)")){
                        int precision = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese la cantidad\nde dígitos decimales: ",
                                        "Precisión de los decimales a imprimir", 3));
                        String mensaje = "Las fracciones almacenadas\n(de manera decimal) son:\n"+ frac1.decimal(precision) +
                                         "\n" + frac2.decimal(precision) + "\n" + fracResult.decimal(precision);
                        JOptionPane.showMessageDialog(null, mensaje, "Historial de fracciones", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Todavía no se ha almacenado ninguna fracción", "Historial de fracciones vacío", 2);
                    }
                    continuar = confirmarSesion(); break;
                }
                case 7 -> {
                    continuar = false;
                    break;
                }
            }
        } while (continuar);
        
        JOptionPane.showMessageDialog(null, "Gracias por utilizar este programa.", "Hasta luego", 1);
        
    }
}
