import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        String nombre1 = "Ana";
        String nombre2 = new String("Luisa");
        
        nombres.add("Luis");
        nombres.add(nombre1);
        nombres.add(nombre2);
        
        // recorrer la colección
        for(String aux: nombres)
        {
            System.out.println("Nombre: " + aux);
        }
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(100);
        numeros.add(300);
        numeros.add(50);
        
        // buscar elemento dentro de la colección
        boolean fueEncontrado = false;
        fueEncontrado = nombres.contains("Ana");
        if(fueEncontrado)
        {
            System.out.println("El nombre fue encontrado");
        }
        else
            System.out.println("El nombre NO fue encontrado");
        
        // mostrar elemento según índice
        System.out.println("Indice 2: " + nombres.get(2));
        
        // buscar y obtener el indice del elemento
        nombres.add("Ana");
        int indice = nombres.indexOf("Ana");
        System.out.println("El indice es: " + indice);
        
        indice = nombres.lastIndexOf("Ana");
        System.out.println("El last indice es: " + indice);
        
        for(String nombre: nombres)
        {
            System.out.println("|====> " + nombre);
        }
        
        // quitar elementos de la colección
        nombres.remove(3);
        nombres.remove("Ana");
        
        // mostrar cantidad de elementos
        System.out.println("Cantidad de elementos: " + nombres.size());
        
        // modificar valor de un objeto ingresado a la colección.
        nombres.set(1, "Fernanda");
        
        for(String nombre: nombres)
        {
            System.out.println("|====> " + nombre);
        }
        // tarea : Leer ppt 2.1.1.
    }
    
}
