
public class Mouse extends Producto {
    private int cantidadBotones;
    private Boolean esOptico;

    public Mouse() {
        this.cantidadBotones = 2;
        this.esOptico = true;
    }

    public Mouse(int cantidadBotones, Boolean esOptico, int id, String nombre, String marca, int precio) {
        super(id, nombre, marca, precio);
        this.cantidadBotones = cantidadBotones;
        this.esOptico = esOptico;
    }

    public Boolean getEsOptico() {
        return esOptico;
    }

    public void setEsOptico(Boolean esOptico) {
        this.esOptico = esOptico;
    }

    public int getCantidadBotones() {
        return cantidadBotones;
    }

    public void setCantidadBotones(int cantidadBotones) {
        this.cantidadBotones = cantidadBotones;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCantidad de Botones  = " + cantidadBotones + 
                "\nEs óptico            = " + (esOptico?"Si":"No");
    }

    @Override
    public void descuento(int porcentaje) {
        int des = 0;
        if(this.getPrecio() < 10000)
            porcentaje = 0;
        else
            des = (int)(this.getPrecio()*porcentaje/100);

        System.out.println("==== Descuento del producto ====");
        System.out.println("Descuento " + porcentaje + "% : " + des);
    }
    
    
}
