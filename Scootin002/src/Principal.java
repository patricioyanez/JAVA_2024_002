
public class Principal {

    public static void main(String[] args) {
        Puesto puesto1 = new Puesto(1000, "Gerente");
        Puesto puesto2 = new Puesto(2000, "Supervisor");
        
        Empleado empleado1 = new Empleado("1-9", "Juana", "m", 30, 2000, puesto1);
        Empleado empleado2 = new Empleado("2-7", "Juan", "H", 40, 2020, puesto2);
        
        Empresa empresa = new Empresa();
        
        empresa.agregar(empleado2);
        if(empresa.buscar("1-9"))
        {
            System.out.println("El rut ya existe"); 
        }
        else
        {
            empresa.agregar(empleado1);
            System.out.println("Empleado agregado");
        }
        
        System.out.println("****** Listado de Empleados ********");
        empresa.listar();
    }
    
}
