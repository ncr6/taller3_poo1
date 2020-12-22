package ejercicio5;

public class MiTiempo {
    private int hora = 12;
    private int minuto = 0;
    private int segundo = 0;
    private boolean isPM = false;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public MiTiempo(int hora, int minuto, int segundo, boolean isPM){
        if (segundo<60){
            this.segundo = segundo;
        }
        if (minuto<60){
            this.minuto = minuto;
        }
        if (hora<12){
            this.hora = hora;
        }
        this.isPM = isPM;
    }
    
    public void incrementarHora() {
        hora++;
        if (hora>12) hora = 1;
        if (hora>11) isPM = !isPM;
    }
    
    public void incrementarMinuto() {
        minuto++;
        if (minuto>59){
            incrementarHora();
            minuto = 0;
        }
    }
   
    public void incrementarSegundo() {
        segundo++;
        if (segundo>59){
            incrementarMinuto();
            segundo = 0;
        }
    }
    
    @Override
    public String toString() {
        String tiempo = "";
        
        if (hora<10) tiempo += ("0"+hora); else tiempo += hora;
        tiempo+=":";
        
        if (minuto<10) tiempo += ("0"+minuto); else tiempo += minuto;
        tiempo+=":";
        
        if (segundo<10) tiempo += ("0"+segundo); else tiempo += segundo;
        
        if (isPM) tiempo += " PM"; else tiempo += " AM";
        
        return tiempo;
    }
}
