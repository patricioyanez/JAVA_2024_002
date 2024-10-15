
public abstract class Vehiculo implements IOperaciones{
    private String patente;
    private String nombreDueno;
    private String marca;
    private String modelo;
    private int totalPagar;

    public Vehiculo() {
        this.patente = "";
        this.nombreDueno = "";
        this.marca = "";
        this.modelo = "";
        this.totalPagar = 0;
    }
    
    public Vehiculo(String patente, String nombreDueno, String marca, String modelo, int totalPagar) {
        this.patente = patente;
        this.nombreDueno = nombreDueno;
        this.marca = marca;
        this.modelo = modelo;
        this.totalPagar = totalPagar;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  " \nPatente         = " + patente + 
                ",\nNombre de Dueño = " + nombreDueno + 
                ",\nMarca           = " + marca + 
                ",\nModelo          = " + modelo + 
                ",\nTotal a pagar   = " + totalPagar;
    }
    
    
}
