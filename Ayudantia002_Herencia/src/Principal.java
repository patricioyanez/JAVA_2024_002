
public class Principal {
    /*
    Crear las clases Producto con los atributos: id, nombre, marca y precio. Adicionalmente
    2 Subclases Teclado ( cantidad de teclas y si es mecanico) y Mouse 
    (cantidad de botones y si es optico).
    
    
        Ejercicio 1: Crear un objeto teclado, completar con
    datos y mostrarlos en la consola.
    
        Ejercicio 2: Crear la clase Mouse. Heredar de la clase
    Producto y agregar los atributos: esOptico y botones.
    
        Ejercicio 3: Crear un objeto mouse, completar con 
    datos y mostrarlos en la consola.
    
        Ejercicio 4: Crear un nuevo teclado y solicitar los
    datos por teclado. (usar Scanner)
    
    Leer ppt 2.1.1 y 2.2.1
    
    */
    public static void main(String[] args) {
        Teclado t1 = new Teclado(105, true, 10, "Teclado agil", "Genius", 15000);
        Mouse m1 = new Mouse(4, true, 50, "Mouse", "Logi", 25000);
        Mouse m2 = new Mouse(2, false, 55, "Mouse", "Genius", 5000);
        
        System.out.println("==== listado de teclados =====");
        System.out.println(t1);
        
        System.out.println("==== listado de Mouse ========");
        System.out.println(m1);
        
        m1.descuento(10);
        m2.descuento(50);
    }
    
}
