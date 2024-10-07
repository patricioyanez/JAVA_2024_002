
public class Ropa extends Producto{
    private String talla;
    private String color;

    public Ropa() {
        this.talla = "";
        this.color = "";
    }

    public Ropa(String talla, String color, String idProducto, String nombre, Double precio) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return super.toString() +
                " talla=" + talla + ", color=" + color;
    }
    
    public void ajustarTalla(String nuevaTalla)
    {
        if("smlxlxxlxxxxl".contains(nuevaTalla))
            this.talla = nuevaTalla;
        else
            System.out.println("Talla no valida!!!");
    }
            
    
}
