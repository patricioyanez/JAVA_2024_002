// En una empresa se requiere guardar los datos de clientes y empleados
// rut, nombre, año nacimiento, telefono, direccion, email.
// 
public class Principal {

    public static void main(String[] args) {
        Cliente c = new Cliente(true, 15000, "1-9", "Ana", 2000, "correo@live.cl");
        Empleado e = new Empleado("Supervisor", 550000 , "2-7", "Luis", 1990, "correo1@live.cl");
        
        System.out.println(" ==== Datos Clientes ====");
        System.out.println(c);
        System.out.println(c.calcularEdad());
        System.out.println("\n ==== Datos Empleados ====");
        System.out.println(e);
        System.out.println(e.calcularEdad() + " años");
        System.out.println("\n **** Sueldo Liquido ****");
        e.calcularSueldo();
        e.calcularSueldo(15000);
        
        // ppt 2.2.1
    }
    
}
