import java.util.Scanner;

public class PrincipalSentenciaSwitch {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese su promedio de notas: ");
        int nota = leerTeclado.nextInt();
        System.out.println("Clasificación de su nota: ");
        
        switch(nota){
            case 1:
                System.out.println("Su rendimiento es nulo");
                break;
            case 2:
                System.out.println("Su rendimiento es muy bajo");
                break;
            case 3:
                System.out.println("Su rendimiento es bajo");
                break;
            case 4:
                System.out.println("Su rendimiento es básico");
                break;
            case 5:
                System.out.println("Su rendimiento es intermedio");
                break;
            case 6:
                System.out.println("Su rendimiento es bueno");
                break;
            case 7:
                System.out.println("Su rendimiento es muy bueno");
                break;
            default:
                System.out.println("Nota no es válida");
        }
        
    }
}
