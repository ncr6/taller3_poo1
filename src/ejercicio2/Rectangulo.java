package ejercicio2;

public class Rectangulo {
    //atributos
private double ancho;
private double largo;

    //Metodos
    public void setAncho(double ancho) {
         if(ancho>0 && ancho<20){
            this.ancho = ancho;
        }
    }


    public double getAncho() {
        return ancho;
    }

    public void setLargo(double largo) {
        if(largo>0 && largo<20){
            this.largo = largo;
        }
    }
    
    public double getLargo() {
        return largo;
    }


    public double area() {
        return getAncho()*getLargo();
    }
    
    
    public double perimetro() {
        return 2*(getAncho()+getLargo());
    }
}
