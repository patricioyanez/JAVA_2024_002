import java.util.Scanner;

public class PrincipalWhile {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        String opcion = "";
        while (true) {
            System.out.println("===== Menú =====");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("0.- Salir");
            System.out.print("Ingrese opción: ");
            opcion = leerTeclado.next();
            
            if(opcion.equals("0"))
            {
                break;
            }
            else if(opcion.equals("1"))
            {
                System.out.println("=== Sumar ===");                
            }                        
            else if(opcion.equals("2"))
            {
                System.out.println("=== Restar ===");                
            }
            else
            {
                System.out.println("Opción ingresada no es correcta");
                continue;
            }
            System.out.println("*** Presione c y enter para continuar");
            leerTeclado.next();
        }
    }
}
