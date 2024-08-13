
public class Principal {
    
    // punto de arranque de la aplicacion
    public static void main(String args [])
    {
        // 
        System.out.println("Hola Mundo!!!");
        
        // sout
        System.out.println("Cómo están???");
        
        // instanciar una clase (crear objeto)
        Pizza pizza1= new Pizza();
        
        Pizza pizza2;
        pizza2 = new Pizza();
        
        pizza1.nombre = "Napolitana";
        pizza1.precio = 15000;
        pizza1.tamano = "mediana";
        pizza1.tipoMasa= "Piedra";
                
        System.out.println("Nombre de pizza:" + pizza1.nombre);
        // imprimir los otros datos 
        // agregar y mostrar datos de la 2da pizza
    }
    
}
