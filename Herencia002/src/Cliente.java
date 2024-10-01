
public class Cliente extends Persona {
    private Boolean esHabitual;
    private int lineaDeCredito;

    public Cliente() {
        this.esHabitual = false;
        this.lineaDeCredito = 0;
    }

    public Cliente(Boolean esHabitual, int lineaDeCredito, String rut, String nombre, int anioNacimiento, String email) {
        super(rut, nombre, anioNacimiento, email);
        this.esHabitual = esHabitual;
        this.lineaDeCredito = lineaDeCredito;
    }

    public int getLineaDeCredito() {
        return lineaDeCredito;
    }

    public void setLineaDeCredito(int lineaDeCredito) {
        this.lineaDeCredito = lineaDeCredito;
    }

    public Boolean getEsHabitual() {
        return esHabitual;
    }

    public void setEsHabitual(Boolean esHabitual) {
        this.esHabitual = esHabitual;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nEs Habitual      = " + (esHabitual?"Si":"No") + 
                "\nLinea De Credito = " + lineaDeCredito;
    }
    
    
    
}
