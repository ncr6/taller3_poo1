package ejercicio7;

public class CuentaAhorro {

    private static float tasa;
    private float saldo;
    private float intereses;
    
    public CuentaAhorro(float tasa, float saldo){
        CuentaAhorro.tasa = tasa;
        this.saldo = saldo;
        intereses = calcularIntereses();
        this.saldo += intereses;
    }
    
    public CuentaAhorro(float saldo){
        this.saldo = saldo;
        intereses = calcularIntereses();
        this.saldo += intereses;
    }
    
    public static float getTasa() {
        return tasa;
    }

    public static void setTasa(float tasa) {
        CuentaAhorro.tasa = tasa;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
        intereses = calcularIntereses();
        this.saldo += intereses;
    }

    public float getIntereses(){
        return intereses;
    }
    
    private float calcularIntereses() {
        return (saldo*tasa)/(float)12;
    }

    @Override
    public String toString(){
        return "El saldo de la cuenta es: S/ "+ String.format("%.2f", saldo) +
                "\nLos intereses incluidos son de: S/ " + String.format("%.2f", intereses);
    }
}
