
public class Marca {
    private String rut;
    private String nombre;
    private String contacto;
    private String direccion;
    
    public Marca() {
        this.rut = "";
        this.nombre = "";
        this.contacto = "";
        this.direccion = "";
    }
    
    public Marca(String rut, String nombre, String contacto, String direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.contacto = contacto;
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String imprimirDatos() {
        return  "\n=== Datos de la marca ===" + 
                "\nRut      =" + rut + 
                "\nNombre   =" + nombre + 
                "\nContacto =" + contacto + 
                "\nDirección=" + direccion;
    }
    
    
    
}
