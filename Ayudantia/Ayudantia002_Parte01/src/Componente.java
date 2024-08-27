
public class Componente {
    // atributos
    private int codigo;
    private String descripcion;
    private String modelo;
    private String marca;
    private int precio;
    private int frecuencia;
    
    // constructores
    public Componente() {
        this.codigo = 0;
        this.descripcion = "";
        this.modelo = "";
        this.marca = "";
        this.precio = 0;
        this.frecuencia = 0;
    }
    
    public Componente(int codigo, String descripcion, String modelo, String marca, int precio, int frecuencia) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.frecuencia = frecuencia;
    }
    
    // getter and setter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    // metodos personalizados
    public String imprimirDatos() {
        return  "====== Datos del componente ======" +
                "\nCodigo       = " + codigo + 
                "\nDescripcion  = " + descripcion + 
                "\nModelo       = " + modelo + 
                "\nMarca        = " + marca + 
                "\nPrecio       = " + precio + 
                "\nFrecuencia   = " + frecuencia;
    }
    
    
    
}
