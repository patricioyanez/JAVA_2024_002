
public class Principal {
    // psvm + tab
    // main + tab
    public static void main(String[] args) {
        
        // crea un objeto
        Pizza pizza1 = new Pizza();
        // asignar valor a cada atributo
        pizza1.setNombre("Vegetaria");
        pizza1.setMasa("Delgada");
        pizza1.setTamano("Familiar");
        pizza1.setPrecio(12000);
        // muestra información de cada atributo del objeto
        System.out.println("== Datos Pizza == ");
        System.out.println("Nombre  : " + pizza1.getNombre());
        System.out.println("Masa    : " + pizza1.getMasa());
        System.out.println("Tamaño  : " + pizza1.getTamano());
        System.out.println("Precio  : " + pizza1.getPrecio());
        
        // Ejercicio 3: Crear una nueva pizza y mostrar sus datos
        
        Pizza pizza2 = new Pizza();
        // asignar valor a cada atributo
        pizza1.setNombre("Napolitana");
        pizza1.setMasa("borde queso");
        pizza1.setTamano("XL");
        pizza1.setPrecio(15000);
        // muestra información de cada atributo del objeto
        System.out.println("== Datos Pizza 2 == ");
        System.out.println("Nombre  : " + pizza1.getNombre());
        System.out.println("Masa    : " + pizza1.getMasa());
        System.out.println("Tamaño  : " + pizza1.getTamano());
        System.out.println("Precio  : " + pizza1.getPrecio());
        
        
        
        
        
    }
    
}
