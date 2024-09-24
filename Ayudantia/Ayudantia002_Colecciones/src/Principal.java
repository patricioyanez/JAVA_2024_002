import java.util.ArrayList;
import java.util.Scanner;

// Crear un menu que permita ingresar nombres, 
// apellidos y sus notas. 
// Agregar otra opcion para listarlos.
// Solicitar los datos por teclado.
public class Principal {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        
        while(true)
        {
            System.out.println("|===== Menú ======|");
            System.out.println("1.-Ingresar nombre y nota");
            System.out.println("2.-Listar");
            System.out.println("3.-Salir");
            System.out.print("Ingrese opción: ");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 3)
                break;
            
            if(opcion == 1)
            {
                System.out.println(" ***** Ingreso de datos ***** ");
                System.out.print("Ingresar nombre: ");
                String nombre = leerTeclado.next();
                System.out.print("Ingresar nota: ");
                int nota = leerTeclado.nextInt();
                nombres.add(nombre);
                notas.add(nota);
                System.out.println("====> Datos guardados");
            }
            else if(opcion == 2)
            {
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println("Nombre: " + nombres.get(i) +
                                        " Nota: " + notas.get(i) );
                }
            }
        }
    }
    
}
