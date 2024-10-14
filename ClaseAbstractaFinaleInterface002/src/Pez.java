
public class Pez extends Animal{

    @Override
    public void comer() {
        System.out.println("Come alga");
    }

    @Override
    public int grabar() {
        System.out.println("Datos del pez guardado");
        return 1;
    }

    @Override
    public void limpiar() {
        System.out.println("Datos en blanco");
    }
    
}
