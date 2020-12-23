package ejercicio6;
import ejercicio4.MiFecha;

public class MiFechaModificada extends MiFecha{
    private boolean anioBisiesto = false;
    private boolean mesDe31 = false;

    public MiFechaModificada(int dia, int mes, int anio){
        super();
        //Verificacion de años bisiestos
        setAnio(anio);
        if ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0)) {
            anioBisiesto = true;
        }
        if (mes>=1 && mes<=12){
            setMes(mes);
        } else {
            throw new IllegalArgumentException("El valor del mes no puede ser mayor que 12 (diciembre), ni menos que 1 (enero)");
        }
        //Verificacion de mes de 31 dias
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            mesDe31 = true;
        }
        if (mes==2){
            if (anioBisiesto){
                if (dia<=29){
                    setDia(dia);
                } else {
                    throw new IllegalArgumentException("Febrero en un año bisiesto no tiene más de 29 días");
                }
            } else {
                if (dia<=28){
                    setDia(dia);
                } else {
                    throw new IllegalArgumentException("Febrero en un año no bisiesto no tiene más de 28 días");
                }
            }
        }
        if (mesDe31){
            if (dia<=31){
                setDia(dia);
            } else {
                throw new IllegalArgumentException("Un mes no puede tener más de 31 días");
            }
        } else {
            if (dia<=30){
                setDia(dia);
            } else {
                throw new IllegalArgumentException("El mes ingresado no tiene más de 30 días");
            }
        }
        setAnio(anio);
    }
    
    private void saltarMes(){
        setDia(1);
        siguienteMes();
    }
    
    public void siguienteDia(){
        setDia(getDia()+1);
        
        if (mesDe31){
            if(getDia()>31){
                saltarMes();
            }
        } else {
            if (getMes()==2){
                if (anioBisiesto){
                    if (getDia()>29){
                        saltarMes();
                    }
                } else {
                    if (getDia()>28){
                        saltarMes();
                    }
                }
            } else {
                if (getDia()>30){
                    saltarMes();
                }
            }
        }
    }
    
    public void siguienteMes(){
        setMes(getMes()+1);
        
        if (getMes()>12){
            setMes(1);
            siguienteAnio();
        } else if(getMes() == 2){
            if (anioBisiesto){
                if(getDia()>29){
                    setDia(29);
                }
            } else {
                if(getDia()>28){
                    setDia(28);
                }
            }
        }
    }
    
    public void siguienteAnio(){
        setAnio(getAnio()+1);
    }
    
}
