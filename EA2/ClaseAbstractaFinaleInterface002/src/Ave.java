
public class Ave extends Animal{

    @Override
    public void comer() {
        System.out.println("Come insectos");
    }
    
    public void mover()
    {
        System.out.println("El ave vuela");
    }

    @Override
    public int grabar() {
        System.out.println("Datos del ave fueron guardados");
        return 1;
    }

    @Override
    public void limpiar() {
        System.out.println("Datos en blanco");
    }
}
