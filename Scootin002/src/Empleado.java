
public class Empleado {
    private String rut;
    private String nombre;
    private String genero;
    private int edad;
    private int anioIngreso;
    private Puesto puesto;

    public Empleado() {
        this.rut = "";
        this.nombre = "";
        this.genero = "";
        this.edad = 0;
        this.anioIngreso = 0;
        this.puesto = new Puesto(); // null;
    }
    
    public Empleado(String rut, String nombre, String genero, int edad, int anioIngreso, Puesto puesto) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.anioIngreso = anioIngreso;
        this.puesto = puesto;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return  "\nRut          = " + rut + 
                "\nNombre       = " + nombre + 
                "\nGenero       = " + genero + 
                "\nEdad         = " + edad + 
                "\nAño Ingreso  = " + anioIngreso + 
                "\nPuesto       = " + puesto;
    }
    
    
    
}
