package ejercicio2;

import javax.swing.*;

public class Main {
    
    private static Rectangulo rectangulo1; 
     public static void ingresaDatos() {
         double largo,ancho;
         do{
              largo = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite una número para la dimensión (largo)","INGRESO DE DATOS",3));
              rectangulo1.setLargo(largo);
              if(rectangulo1.getLargo()==0 ){
                 JOptionPane.showMessageDialog(null,"Por favor ingrese un número (0<N<20) ","DATOS INVÁLIDOS",2);
             }
         }while(rectangulo1.getLargo()==0 );
         
         do{
            ancho = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite una número para la dimensión (ancho)","INGRESO DE DATOS",3));
            rectangulo1.setAncho(ancho);
             if(rectangulo1.getAncho()==0 ){
                 JOptionPane.showMessageDialog(null,"Por favor ingrese un número (0<N<20) ","DATOS INVALIDOS",2);
             }
         }while(rectangulo1.getAncho()==0 );
         
    }
     public static void mostrarResultados() {
        String datos="DATOS GENERALES:\n";
        datos= datos +"Lado:  "+rectangulo1.getLargo()+" \nAncho: "+ rectangulo1.getAncho() +"\nPerímetro: "+ rectangulo1.perimetro() + "\nÁrea: "+rectangulo1.area();
         JOptionPane.showMessageDialog(null, datos,"SALIDA DE DATOS",1);
    }
    
    public static void main(String[] args) {
        
         rectangulo1 = new Rectangulo();
         
         JOptionPane.showMessageDialog(null,"Programa que calcula el área y perímetro de un rectángulo","Áreas y Perímetros",1);
         ingresaDatos();
         mostrarResultados();
    }
    
}
