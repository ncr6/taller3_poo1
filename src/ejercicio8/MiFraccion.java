package ejercicio8;

import javax.swing.JOptionPane;

public class MiFraccion {
    private int numerador = 0;
    private int denominador = 0;
    
    public MiFraccion(){}
    
    public MiFraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    private void simplificar(){
        int num1 = numerador; int num2 = denominador;
        int aux1 = Math.abs(num1); int aux2 = Math.abs(num2);
        
        while (aux1 != aux2){
            if (aux1 > aux2)
                aux1 -= aux2;
            else
                aux2 -= aux1;
        }
       
        numerador = num1/aux1;
        denominador = num2/aux1;
    }
    
    /* Para evitar que el metodo simplificar() sea sobreescrito
    y hacerlo accesible desde fuera de la clase */
    public void autoSimplificar(){
        simplificar();
    }
    
    public void ingresarValores(String titulo){
        numerador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numerador:", titulo, 3));
        denominador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el denominador:", titulo, 3));
        simplificar();
    }
    
    public void setFraccionSimplificar(int[] valores){
        setNumerador(valores[0]);
        setDenominador(valores[1]);
        simplificar();
    }
    
    public int[] sumarConFraccion(MiFraccion otraFrac){
        int den = denominador*otraFrac.getDenominador();
        int num = (numerador*otraFrac.getDenominador()) + (denominador*otraFrac.getNumerador());
        int[] resultado = {num, den};
        return resultado;
    }
    
    public int[] restarConFraccion(MiFraccion otraFrac){
        int den = denominador*otraFrac.getDenominador();
        int num = (numerador*otraFrac.getDenominador()) - (denominador*otraFrac.getNumerador());
        int[] resultado = {num, den};
        return resultado;
    }
    
    public int[] multiplicarConFraccion(MiFraccion otraFrac){
        int num = numerador*otraFrac.getNumerador();
        int den = denominador*otraFrac.getDenominador();
        int[] resultado = {num, den};
        return resultado;
    }
    
    public int[] dividirConFraccion(MiFraccion otraFrac){
        int num = numerador*otraFrac.getDenominador();
        int den = denominador*otraFrac.getNumerador();
        int[] resultado = {num, den};
        return resultado;
    }
    
    @Override
    public String toString(){
        if (numerador != 0 && denominador != 0){
            return numerador+"/"+denominador;
        } else {
            return "(vacío)";
        }
    }
    
    public String decimal(int precision){
        if (numerador != 0 && denominador != 0){
            double num = (double) numerador; double den = (double) denominador;
            double fracDec = num/den;
            return String.format("%."+precision+"f", fracDec);
        } else {
            return "(vacío)";
        }
    }
}
