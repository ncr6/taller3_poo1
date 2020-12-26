package ejercicio10;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class ListaNombres {
    private final int TAM;
    private String[] arreglo;
    private int pos = -1;
    
    public ListaNombres(int TAM){
        if(TAM>4 || TAM<=20){
            this.TAM = TAM;
        } else {
            throw new IllegalArgumentException("El tamaño del arreglo no puede exceder 20 ni ser inferior a 4");
        }
        arreglo = new String[TAM];
    }
    
    public int getPos(){
        return pos;
    }
    
    public void agregar(String nombre){
        if (pos<TAM-1){
            pos++;
            arreglo[pos] = nombre;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el nombre.\nEl arreglo ya está lleno.", "Arreglo lleno", 0);
        }
    }
    
    public void eliminar(int posEliminar){
        if (posEliminar<=pos){
            if (posEliminar < TAM-1){
                for (int i=posEliminar; i<TAM-1; i++){
                    arreglo[i] = arreglo[i+1];
                }
            }
            pos--;  
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar del arreglo el elemento de la posición "+pos+".\nNo existe ningún elemento en dicha posición", "Error de eliminación: Posición vacía", 0);
        }
    }
    
    public String buscarPorPos(int posicion){
        String[] arregloDes = Arrays.copyOfRange(arreglo, 0, pos);
        Arrays.sort(arregloDes);
        return arregloDes[posicion];
    }
    
    public void verificarElemento(String nombre){
        String mensaje;
        int[] foundPos = new int[pos];
        int coincidencias = 0;
        for (int i=0; i<pos; i++){
            if (nombre.equals(arreglo[i])){
                foundPos[coincidencias] = i;
                coincidencias++;
            }
        }
        if (coincidencias != 0){
            mensaje = "El elemento "+nombre+" pertenece al arreglo.\n";
            if (coincidencias == 1){
                mensaje += "Se encontró 1 coincidencia en la posición "+foundPos[0]+".";
            } else {
                mensaje += "Se encontraron "+coincidencias+" coincidencias en las posiciones: ";
                for (int i=0; i<coincidencias; i++){
                    mensaje += foundPos[i];
                }
            }
        } else {
            mensaje = "El elemento "+nombre+" no fue encontrado en el arreglo.";
        }
        JOptionPane.showMessageDialog(null, mensaje, "Resultados de la búsqueda", 1);
    }

    public void insertar(String nombre, int posInsertar){
        if (posInsertar<=pos){
            arreglo[posInsertar] = nombre; 
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el nombre en la posición solicitada.\nAún no se han agregado datos hasta esa posición.", "Error de posición", 0);
        }
    }
    
    public void listarDescendente(){
        if (pos != -1){
            String[] arregloDes = Arrays.copyOfRange(arreglo, 0, pos);
            Arrays.sort(arregloDes);
            String mensaje = "La lista de elementos del arreglo\n(de manera ascendiente) es:\n";
            for (int i=0; i<=pos; i++){
                mensaje += arregloDes[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje, "Listado de elementos (ascendiente)", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El arreglo se encuentra vacío.\nNo hay datos para listar.", "Arreglo vacío", 2);
        }
    }

}