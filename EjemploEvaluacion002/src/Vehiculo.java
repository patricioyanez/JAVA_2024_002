
public class Vehiculo {
    private String patente;
    private int kilometraje;
    private String marca;
    private int costoServicio;
    private Cliente cliente;

    public Vehiculo() {
        this.patente = "";
        this.kilometraje = 0;
        this.marca = "";
        this.costoServicio = 0;
        this.cliente = null; // new Cliente();
    }
    public Vehiculo(String patente, int kilometraje, String marca, int costoServicio, Cliente cliente) {
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.marca = marca;
        this.costoServicio = costoServicio;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(int costoServicio) {
        this.costoServicio = costoServicio;
    }

    public String imprimirDatos() {
        return "Vehiculo{" + "patente=" + patente + 
                ", kilometraje=" + kilometraje + 
                ", marca=" + marca + ", costoServicio=" + costoServicio + 
                ", cliente=" + cliente.getNombre() + '}';
    }
    
    public void descuento(){
        
        
    }
    public void enviarCorreo()
    {
        
    }
    
}
