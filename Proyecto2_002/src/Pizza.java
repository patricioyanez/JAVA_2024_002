
public class Pizza {
    // atributos
    private String nombre;
    private String tamano;
    private String masa;
    private int precio;
    
    // constructor
    
    // getter and setter
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    // Ejercicio 2: realizar gettter y setter
    // de los otros atributos
    
    
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    // metodos personalizados
    public void imprimirDatos()
    {
        System.out.println("\n== Datos Pizza == ");
        System.out.println("Nombre  : " + getNombre());
        System.out.println("Masa    : " + getMasa());
        System.out.println("Tamaño  : " + getTamano());
        System.out.println("Precio  : " + precio);
    }
}
