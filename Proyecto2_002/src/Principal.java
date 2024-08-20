
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
        pizza2.setNombre("Napolitana");
        pizza2.setMasa("borde queso");
        pizza2.setTamano("XL");
        pizza2.setPrecio(15000);
        // muestra información de cada atributo del objeto
        System.out.println("== Datos Pizza == ");
        System.out.println("Nombre  : " + pizza2.getNombre());
        System.out.println("Masa    : " + pizza2.getMasa());
        System.out.println("Tamaño  : " + pizza2.getTamano());
        System.out.println("Precio  : " + pizza2.getPrecio());
        
        Pizza pizza3 = new Pizza();
        // asignar valor a cada atributo
        pizza3.setNombre("Pollo BBQ");
        pizza3.setMasa("Piedra");
        pizza3.setTamano("Familiar");
        pizza3.setPrecio(18000);        
        pizza3.imprimirDatos();
        
        
    }
    
}
