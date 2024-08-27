
public class Cliente {
    private String rut;
    private String nombre;
    private int telefono;
    private String correo;
    private String direccion;

    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.telefono = 0;
        this.correo = "";
        this.direccion = "";
    }
    public Cliente(String rut, String nombre, int telefono, String correo, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String imprimirDatos() {
        return  "==== Datos del Cliente ====" + 
                "\nRut      = " + rut + 
                "\nNombre   = " + nombre + 
                "\nTelefono = " + telefono + 
                "\nCorreo   = " + correo + 
                "\nDireccion= " + direccion;
    }
    
    
}
