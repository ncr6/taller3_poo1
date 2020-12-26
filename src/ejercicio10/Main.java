package ejercicio10;
import javax.swing.JOptionPane;

public class Main {
    public static int menu(){
        int opcion;
        String mensajeMenu = "Seleccione una opcion del menú:" +
                             "\n1. Agregar un nombre al arreglo"+
                             "\n2. Eliminar un nombre de acuerdo a su posición"+
                             "\n3. Obtener un nombre dada su posición."+
                             "\n4. Verificar existencia de un nombre en el arreglo."+
                             "\n5. Insertar un nombre dada su posición."+
                             "\n6. Listar los nombres ordenados en forma alfabética."+
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
        int tam_arr, opc, c;
        String a;
        boolean continuar = true;
        
        JOptionPane.showMessageDialog(null, "Este programa realiza operaciones con un arreglo de nombres", "Bienvenido", 1);
        
        do{
            tam_arr = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño máximo del arreglo.\nSe permiten valores entre 4 y 20.", "Tamaño máximo del arreglo", 3));
            if (tam_arr<4 || tam_arr>20)
                JOptionPane.showMessageDialog(null, "Por favor ingrese solamente valores nombres entre 4 y 20.", "Cantidad ingresada inválida", 0);
        } while (tam_arr<4 || tam_arr>20);
        
        ListaNombres lis = new ListaNombres(tam_arr);
        
        
        
        do{
            opc = menu();
            switch (opc){
                case 1 -> {
                    a = JOptionPane.showInputDialog(null,"Ingrese el nombre nombre que desee agregar:","Ingreso de un nombre",3);
                    lis.agregar(a);
                    continuar = confirmarSesion(); break;
                }
                case 2 -> {
                    c = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la posición del nombre nombre a eliminar:","Eliminación de un nombre",3));
                    lis.eliminar(c);
                    continuar = confirmarSesion(); break;
                }
                case 3 -> {
                    c = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la posición del arreglo a leer:","Obtención de nombre por posición",3));
                    if (c>=0 && c<=lis.getPos())
                        JOptionPane.showMessageDialog(null, "El nombre que ocupa la posición "+c+" es:\n"+lis.buscarPorPos(c), "Resultados de búsqueda", 1);
                    else
                        JOptionPane.showMessageDialog(null, "La posición ingresada está vacía o es inválida.", "Posición inválida", 0);
                    continuar = confirmarSesion(); break;             
                }
                case 4 -> {
                    a = JOptionPane.showInputDialog(null,"Ingrese el nombre que desee buscar en el arreglo:","Búsqueda de un nombre en el arreglo",3);
                    lis.verificarElemento(a);
                    continuar = confirmarSesion(); break;               
                }
                case 5 -> {
                    a = JOptionPane.showInputDialog(null,"Ingrese el nombre que desee insertar:","Inserción de elemento en posición",3);
                    c = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la posición del arreglo\ndonde desea insertar el elemento:","Inserción de elemento en posición",3));
                    lis.insertar(a, c);
                    continuar = confirmarSesion(); break;
                }
                case 6 -> {
                    lis.listarDescendente();
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
