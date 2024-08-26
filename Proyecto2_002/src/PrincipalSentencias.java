import java.util.Scanner;

public class PrincipalSentencias {
    public static void main(String[] args) {
        int numero = 0;
        
        if(numero == 0)
        {
            System.out.println("El número es cero");
            System.out.println("Más de una linea");
        }
        
        if(numero == 0)
            System.out.println("El número es cero");
        
        if(numero <= 0)
        {
            System.out.println("El número es menor o igual a cero");
        }
        else
        {
            System.out.println("El número es mayor a cero");
        }
        
        int numero2 = 15;
        if(numero2 == 0)
            System.out.println("El numero 2 es igual a cero");
        else if(numero2 > 0)
            System.out.println("El numero 2 es mayor a cero");
        
        if(numero2 == 0)
        {
            System.out.println("Numero es cero");
        }
        else if(numero2 > 0)
        {
            System.out.println("Numero es mayor a cero");
        }
        else
        {
            System.out.println("Todo es falso");
        }
        
        // Leer el teclado (input)
        Scanner leerTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = leerTeclado.next();
        
        System.out.println("Bienvenido " + nombre);
        
        // Ejercicio:
        // preguntar al usuario un numero y determinar 
        // si es natural o no
        
        System.out.println("Ingrese un numero");
        int valor = leerTeclado.nextInt();
        
        if(valor >= 0)
        {
            System.out.println("El número es natural");
        }
        else
        {
            System.out.println("El número no es natural");
        }
        
        // determinar si el numero es +, - o neutro
        System.out.print("Ingrese un 2do numero: ");
        int valor2 = leerTeclado.nextInt();
        
        if(valor2 == 0)
        {
            System.out.println("El número neutro");
        }
        else if (valor2 > 0) {
            System.out.println("El número es positivo");
        }
        else
        {
            System.out.println("El número es negativo");
        }
    }
}
