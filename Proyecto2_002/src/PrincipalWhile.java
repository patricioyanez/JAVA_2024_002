import java.util.Scanner;

public class PrincipalWhile {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        String opcion = "";
        while (!opcion.equals("0")) {
            System.out.println("===== Menú =====");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("0.- Salir");
            System.out.print("Ingrese opción: ");
            opcion = leerTeclado.next();
            
            if(opcion.equals("1"))
            {
                System.out.println("=== Sumar ===");
                
            }
            System.out.println("*** Presione c y enter para continuar");
            leerTeclado.next();
        }
    }
}
