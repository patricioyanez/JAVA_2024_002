
public class Empleado extends Persona{
    private String cargo;
    private int sueldo;

    public Empleado() {
        super();
        this.cargo = "";
        this.sueldo = 0;
    }
    
    public Empleado(String cargo, int sueldo, String rut, String nombre, int anioNacimiento, String email) {
        super(rut, nombre, anioNacimiento, email); // debe estar siempre primero
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nCargo    = " + cargo + 
                "\nSueldo   = " + sueldo;
    }
    
    
}
