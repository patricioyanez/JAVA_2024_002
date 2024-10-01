
public class Persona {
    private String rut;
    private String nombre;
    private int anioNacimiento;
    private String email;

    public Persona() {
        this.rut = "";
        this.nombre = "";
        this.anioNacimiento = 0;
        this.email = "";
    }
    public Persona(String rut, String nombre, int anioNacimiento, String email) {
        this.rut = rut;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }


    
    
}
