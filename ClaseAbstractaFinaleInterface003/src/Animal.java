
public abstract class Animal {
    private int cantidadOjos;
    private int cantidadPatas;
    private String queSonidoEmite;

    public Animal() {
        this.cantidadOjos = 0;
        this.cantidadPatas = 0;
        this.queSonidoEmite = "";
    }
    
    public Animal(int cantidadOjos, int cantidadPatas, String queSonidoEmite) {
        this.cantidadOjos = cantidadOjos;
        this.cantidadPatas = cantidadPatas;
        this.queSonidoEmite = queSonidoEmite;
    }

    public String getQueSonidoEmite() {
        return queSonidoEmite;
    }

    public void setQueSonidoEmite(String queSonidoEmite) {
        this.queSonidoEmite = queSonidoEmite;
    }

    public int getCantidadOjos() {
        return cantidadOjos;
    }

    public void setCantidadOjos(int cantidadOjos) {
        this.cantidadOjos = cantidadOjos;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    @Override
    public String toString() {
        return  "\nCantidad de Ojos = " + cantidadOjos + 
                "\nCantidad de Patas= " + cantidadPatas + 
                "\nSonido que Emite = " + queSonidoEmite;
    }
    // definicion de metodo abstracto
    public abstract void mover();
}
