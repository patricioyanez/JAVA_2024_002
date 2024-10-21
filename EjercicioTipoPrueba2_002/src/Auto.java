
public class Auto extends Vehiculo{
    private int cantidadPuertas;
    private int capacidadMaletero;

    public Auto() {
        this.cantidadPuertas = 0;
        this.capacidadMaletero = 0;
    }

    public Auto(int cantidadPuertas, int capacidadMaletero, String patente, String nombreDueno, String marca, String modelo, int totalServicio, int totalPagar) {
        super(patente, nombreDueno, marca, modelo, totalServicio, totalPagar);
        this.cantidadPuertas = cantidadPuertas;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCantidad de Puertas  = " + cantidadPuertas + 
                "\nCapacidad de Maletero= " + capacidadMaletero;
    }

    @Override
    public void totalPorPagar() {
        int resultado = getTotalServicio() + getIVA();
        this.setTotalPagar(resultado);
    }

    @Override
    public void totalConIVA() {
        int resultado = (int)(this.getTotalServicio() * IVA / 100);
        this.setIVA(resultado);
    }

    @Override
    public void obtenerDescuento() {
        int resultado = (int)(this.getTotalServicio() * DESCUENTO_AUTOMOVIL / 100);
        this.setTotalServicio(this.getTotalServicio() - resultado);
    }
    // sobre carga del método
    public void obtenerDescuento(double descuento) {
        int resultado = (int)(this.getTotalServicio() * descuento / 100);
        this.setTotalServicio(resultado);
    }
    
    
    
}
