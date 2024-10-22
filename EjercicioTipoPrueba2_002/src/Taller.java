
import java.util.ArrayList;

// crear los metodos CRUD
public class Taller {
    private ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
    
    public boolean guardar(Vehiculo vehiculo)
    {
        // verificar que la patente no esté
        if(this.buscarPorPatente(vehiculo.getPatente()))
            return false;
        else
        {
            vehiculo.totalConIVA();
            vehiculo.totalPorPagar();
            return listado.add(vehiculo);
        }
    }
    
    public boolean buscarPorPatente(String patente)
    {
        for (Vehiculo vehiculo : listado) {
            if(vehiculo.getPatente().equalsIgnoreCase(patente))
                return true;
        }
        return false;
    }
    
    public boolean eliminarPorPatente(String patente)
    {
        for (Vehiculo vehiculo : listado) {
            if(vehiculo.getPatente().equalsIgnoreCase(patente))
            {
                listado.remove(vehiculo);
                return true;
            }
        }
        return false;
    }
    public void listar()
    {
        System.out.println("\n===== listado de vehiculos =====");
        for (Vehiculo vehiculo : listado) {
            System.out.println(vehiculo);
        }
    }
    public void contabilidar()
    {
        int moto = 0;
        int auto = 0;
        System.out.println("\n===== contabilizar vehiculos =====");
        for (Vehiculo vehiculo : listado) {
            if(vehiculo instanceof Moto)
                moto++;
            else
                auto++;
        }
        
        System.out.println("Cantidad de motos: " + moto);
        System.out.println("Cantidad de autos: " + auto);
    }
}
