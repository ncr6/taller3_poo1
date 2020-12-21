package ejercicio4;

public class MiFecha {
    
    private int dia = 1;
    private int mes = 1;
    private int anio = 0;
    private String mes_literal = "indefinido";
    private static final String[] meses_validos = new String[] {"enero","febrero","marzo",
    "abril","mayo","junio","julio","agosto","setiembre","octubre","noviembre","diciembre"};
    
    public MiFecha(int dia, int mes, int anio, boolean mesInicia){
        if (!mesInicia){
            this.dia = dia;
            this.mes = mes;
        } else {
            this.mes = dia;
            this.dia = mes;
        }
        this.anio = anio;
        mes_literal = meses_validos[this.mes-1];
    }
    
    public MiFecha(String mes_literal, int dia, int anio){
        for (int i=0; i<12; i++){
            if (mes_literal.toLowerCase().equals(meses_validos[i])){
                this.mes_literal = mes_literal.toLowerCase();
                this.mes = i+1;
            }
        }
        this.dia = dia;
        this.anio = anio;
    }
    
    public MiFecha(String mes_literal, int anio){
        for (int i=0; i<12; i++){
            if (mes_literal.toLowerCase().equals(meses_validos[i])){
                this.mes_literal = mes_literal.toLowerCase();
                this.mes = i+1;
            }
        }
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMes_literal() {
        return mes_literal;
    }

    public void setMes_literal(String dia_literal) {
        this.mes_literal = dia_literal;
    }
    
    public String getFechaMMDDAA() {
        String fecha;
        
        if (mes<10){
            fecha = "0";
            fecha += Integer.toString(mes);
        } else {
            fecha = Integer.toString(mes);
        }
        
        fecha += "/";
        
        if (dia<10){
            fecha += ("0" + Integer.toString(dia));
        } else {
            fecha += Integer.toString(dia);
        }
        
        fecha += "/";
        
        if (anio%100<10){
            fecha += ("0"+Integer.toString(anio%100));
        } else {
            fecha += Integer.toString(anio%100);
        }
        
        return fecha;
    }
    
    public String getFechaDDMMAA() {
        String fecha;
        
        if (dia<10){
            fecha = "0";
            fecha += Integer.toString(dia);
        } else {
            fecha = Integer.toString(dia);
        }
        
        fecha += "/";
        
        if (mes<10){
            fecha += ("0" + Integer.toString(mes));
        } else {
            fecha += Integer.toString(mes);
        }
        
        fecha += "/";
        
        if (anio%100<10){
            fecha += ("0"+Integer.toString(anio%100));
        } else {
            fecha += Integer.toString(anio%100);
        }
        
        return fecha;
    }
    
    public String getFechaMLDA() {
        return mes_literal + " " + Integer.toString(dia) + ", " + Integer.toString(anio);
    }
    
    public String getFechaMLA() {
        return mes_literal + " " + Integer.toString(anio);
    }
}
