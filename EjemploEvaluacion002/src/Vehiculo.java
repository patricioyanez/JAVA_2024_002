
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
        if(this.patente.trim().length() != 6)
        {
            System.out.println("=====> ERROR: Patente no válida");
            this.patente = "";
        }
        else
            this.patente = patente.trim();
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        if(kilometraje < 0 && kilometraje > 500000)
        {
            System.out.println("=====> ERROR: Kilometraje no es válido");
            this.kilometraje = 0;
        }
        else
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
        if(cliente.isEsNuevo() || this.costoServicio >= 100000)
        {
            this.costoServicio = (int)(this.costoServicio * .9);
        }        
    }
    public void enviarCorreo()
    {
        String mensaje = "Estimado: " + cliente.getNombre() +
                " Escribo para informar que su vehiculo patente " +
                this.patente + " ya esta listo para su retiro."+ 
                " su correo es: " + cliente.getCorreo();
                
        System.out.println(mensaje);
    }
    
}
