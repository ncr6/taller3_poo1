package ejercicio9;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class ListaEnteros {
    private final int TAM;
    private int[] arreglo;
    private int pos = -1;
    
    public ListaEnteros(int TAM){
        if(TAM>1 || TAM<=20){
            this.TAM = TAM;
        } else {
            throw new IllegalArgumentException("El tamaño del arreglo no puede exceder 20 ni ser inferior a 1");
        }
        arreglo = new int[TAM];
    }
    
    public int getPos(){
        return pos;
    }
    
    public void agregar(int numero){
        if (pos<TAM-1){
            pos++;
            arreglo[pos] = numero;
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el número.\nEl arreglo ya está lleno.", "Arreglo lleno", 0);
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
    
    public int buscarPorPos(int posicion){
        return arreglo[posicion];
    }
    
    public void verificarElemento(int numero){
        String mensaje;
        int[] foundPos = new int[pos];
        int coincidencias = 0;
        for (int i=0; i<pos; i++){
            if (numero == arreglo[i]){
                foundPos[coincidencias] = i;
                coincidencias++;
            }
        }
        if (coincidencias != 0){
            mensaje = "El elemento "+numero+" pertenece al arreglo.\n";
            if (coincidencias == 1){
                mensaje += "Se encontró 1 coincidencia en la posición "+foundPos[0]+".";
            } else {
                mensaje += "Se encontraron "+coincidencias+" coincidencias en las posiciones: ";
                for (int i=0; i<coincidencias; i++){
                    mensaje += foundPos[i];
                }
            }
        } else {
            mensaje = "El elemento "+numero+" no fue encontrado en el arreglo.";
        }
        JOptionPane.showMessageDialog(null, mensaje, "Resultados de la búsqueda", 1);
    }

    public void insertar(int entero, int posInsertar){
        if (posInsertar<=pos){
            arreglo[posInsertar] = entero; 
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el número en la posición solicitada.\nAún no se han agregado datos hasta esa posición.", "Error de posición", 0);
        }
    }
    
    public void listarDescendente(){
        if (pos != -1){
            int[] arregloDes = Arrays.copyOfRange(arreglo, 0, pos);
            Arrays.sort(arregloDes);
            String mensaje = "La lista de elementos del arreglo\n(de manera descendiente) es:\n";
            for (int i=pos; i>=0; i--){
                mensaje += arreglo[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje, "Listado de elementos (descendiente)", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El arreglo se encuentra vacío.\nNo hay datos para listar.", "Arreglo vacío", 2);
        }
    }

}
