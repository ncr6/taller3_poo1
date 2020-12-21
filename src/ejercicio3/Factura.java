
package ejercicio3;

public class Factura {
    //Atributos
    private String nombreDelCliente;
    private int cantidadVendida;
    private float cantidadVenta;
    public static final float IGV=0.19f;
    //Metodos

    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }
    
    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    
    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    
public void setCantidadVenta(float cantidadVenta) {
        this.cantidadVenta = cantidadVenta;
    }

    public float getCantidadVenta() {
        return cantidadVenta;
    }

    
    
    public float ventaBruta(){
        return getCantidadVendida()*getCantidadVenta();
    }
   
    
    public float igv(){
        return ventaBruta()*IGV;
        
    }
    
    public float ventaLiquida(){
        return ventaBruta()-igv();
        
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getNombreDelCliente() + "\nCantidad vendida: " + getCantidadVendida()+
                "\nCantidad ventas: " + getCantidadVenta();
    }
}
