import java.util.ArrayList;
// clase gestora de empleados de la empresa
public class Empresa {
    private ArrayList<Empleado> empleados;
    
    Empresa()
    {
        empleados = new ArrayList<Empleado>();
    }
    
    public boolean agregar(Empleado empleado)
    {
        return empleados.add(empleado);
    }
    public boolean buscar(String rut)
    {
        for(Empleado empleado: empleados)
        {
            if(empleado.getRut().equals(rut) )
                return true;
        }
        return false;
    }
    public void listar()
    {
        for(Empleado empleado: empleados)
        {
            System.out.println(empleado);
        }
    }
    public boolean eliminar(String rut)
    {
        for(Empleado empleado: empleados)
        {
            if(empleado.getRut().equals(rut) )
                return empleados.remove(empleado);
        }
        return false;
    }
}
