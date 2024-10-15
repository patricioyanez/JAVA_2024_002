
import java.util.ArrayList;

// crear los metodos CRUD
public class Taller {
    ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
    
    public boolean guardar(Vehiculo vehiculo)
    {
        // verificar que la patente no esté
        if(this.buscarPorPatente(vehiculo.getPatente()))
            return false;
        else
            return listado.add(vehiculo);
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
}
