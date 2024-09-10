import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        Cliente cliente = new Cliente();
        Vehiculo vehiculo = new Vehiculo();
        
        while(true)
        {
            System.out.println("1.- Crear Cliente y Vehiculo");
            System.out.println("2.- Mostrar información");
            System.out.println("3.- Agregra monto de servicio");
            System.out.println("4.- Enviar el correo");
            System.out.println("5.- Salir");
            System.out.print("Ingrese opción: ");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 1)
            {
                cliente.setRut("500000-5");
                cliente.setNombre("Juan");
                cliente.setCorreo("fasdfa@mail.com");
                cliente.setCodigo(32);
                cliente.setTelefono(89798465);
                cliente.setEsNuevo(true);
                
                vehiculo.setPatente("asdf60");
                vehiculo.setMarca("Kia");
                vehiculo.setKilometraje(100000);
                vehiculo.setCostoServicio(0);
                vehiculo.setCliente(cliente);
                System.out.println("**** Datos Creados ****");
            }
            else if(opcion == 2)
            {
                System.out.println("**** Opcion 2 ****");
            }
            else if(opcion == 3)
            {
                System.out.println("**** Opcion 3 ****");
            }
            else if(opcion == 4)
            {
                System.out.println("**** Opcion 4 ****");
            }
            else if(opcion == 5)
            {
                break;
            }
            else
            {
                System.out.println("La opción seleccionada no es válida");
            }
            System.out.println("Precione c para continuar");
            leerTeclado.next();
        }
    }
    
}
