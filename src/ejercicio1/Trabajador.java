/*
 * Clase Trabajador con los siguientes atributos: nombre, salario por hora y 
 * cantidad de horas laboradas. La clase cuenta con métodos que permiten calcular: 
 * el sueldo bruto (salario por hora * cantidad de horas laboradas), el monto del descuento 
 * equivalente al 12% del sueldo bruto y el sueldo neto (sueldo bruto menos descuento).
 */
package ejercicio1;

/**
 *
 * @author Zoraida Vidal
 */
public class Trabajador {
    private String nombre;
    private float salarioPorHora;
    private float horasLaboradas;
    public final static float DSCTO = 0.12f;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setSalarioPorHora(float salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    
    public float getSalarioPorHora() {
        return salarioPorHora;
    }
    
    public void setHorasLaboradas(float horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }
    
    public float getHorasLaboradas() {
        return horasLaboradas;
    }
    
    public float getSueldoBruto() {
        return getSalarioPorHora() * getHorasLaboradas();
    }
    
    public float getMontoDeDescuento() {
        return getSueldoBruto() * DSCTO;
    }
    
    public float getSueldoNeto() {
        return getSueldoBruto() - getMontoDeDescuento();
    }
    
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nSalario por hora: " + getSalarioPorHora() +
                "\nHoras laboradas: " + getHorasLaboradas();
    }
}