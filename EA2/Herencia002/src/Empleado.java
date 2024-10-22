
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

    @Override /// ejemplo de sobreEscritura
    public int calcularEdad() {
        System.out.println("===== Edad de empleado =====");
        return super.calcularEdad(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    // ejemplo de sobrecarga
    public void calcularSueldo()
    {
        double liquido = 0;
        System.out.println("==>Detalle");
        System.out.println("Base    : " + sueldo);
        System.out.println("Salud   : " + (int)(sueldo * 0.07));
        System.out.println("AFP     : " + (int)(sueldo * 0.1));
        liquido = sueldo - ((sueldo * 0.07) + (sueldo * .1));
        System.out.println("Liquido : " + (int)liquido);
      
    }
    public void calcularSueldo(int descuento)
    {
        double liquido = 0;
        System.out.println("==>Detalle");
        System.out.println("Base    : " + sueldo);
        System.out.println("Salud   : " + (int)(sueldo * 0.07));
        System.out.println("AFP     : " + (int)(sueldo * 0.1));
        liquido = sueldo - ((sueldo * 0.07) + (sueldo * .1));
        System.out.println("Descueto: " + descuento);
        System.out.println("Liquido : " + ((int)liquido - descuento));
      
    }
}
