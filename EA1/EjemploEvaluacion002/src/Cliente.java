
public class Cliente {
    private String rut;
    private String nombre;
    private int codigo;
    private int telefono;
    private String correo;
    private boolean esNuevo;

    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.codigo = 0;
        this.telefono = 0;
        this.correo = "";
        this.esNuevo = false;
    }
    
    public Cliente(String rut, String nombre, int codigo, int telefono, String correo, boolean esNuevo) {
        this.rut = rut;
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
        this.correo = correo;
        this.esNuevo = esNuevo;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if(rut.trim().length() == 0)
        {            
            System.out.println("=====> ERROR: el rut no válido");
            this.rut = "";
        }
        else
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.trim().length() == 0)
        {            
            System.out.println("=====> ERROR: el nombre no válida");
            this.nombre = "";
        }
        else
            this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo < 9 || codigo > 99)
        {            
            System.out.println("=====> ERROR: cantidad de digitos no válida");
            this.codigo = 0;
        }
        else
            this.codigo = codigo;
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
        return  "\n==== Cliente ====" + 
                "\nRut      = " + rut + 
                "\nNombre   = " + nombre + 
                "\nCodigo   = " + codigo + 
                "\nTelefono = " + telefono + 
                "\nCorreo   = " + correo + 
                "\nEs Nuevo = " + (esNuevo?"Si":"No");
    }
    
    
            
}
