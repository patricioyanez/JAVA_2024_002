
public final class Moto extends Vehiculo{
    private String estilo; 
    private int medidaManillar;

    public Moto() {
        this.estilo = "";
        this.medidaManillar = 0;
    }

    public Moto(String estilo, int medidaManillar, String patente, String nombreDueno, String marca, String modelo, int totalServicio, int totalPagar) {
        super(patente, nombreDueno, marca, modelo, totalServicio, totalPagar);
        this.estilo = estilo;
        this.medidaManillar = medidaManillar;
    }

    public int getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(int medidaManillar) {
        this.medidaManillar = medidaManillar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nEstilo            = " + estilo + 
                "\nMedida de Manillar= " + medidaManillar;
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
        int resultado = (int)(this.getTotalServicio() * DESCUENTO_MOTOCICLETA / 100);
        this.setTotalServicio(resultado);
    }
    // sobre carga del método
    public void obtenerDescuento(double descuento) {
        int resultado = (int)(this.getTotalServicio() * descuento / 100);
        this.setTotalServicio(resultado);
    }
    

    

}
