
public class ClaseString {
    public static void main(String[] args) {
        String nombre = "juan";
        String apellido = new String("Perez");
        
        System.out.println("Nombre  : " + nombre);
        System.out.println("Apellido: " + apellido);
        
        // longitud de caracteres:
        String nombre2 = "Francisca ";
        int cantidadCaracteres = nombre2.length();
        System.out.println("caracteres: " + cantidadCaracteres);
        
        String nombre3 = " Juan ";
        System.out.println("****" + nombre3 + "****");
        nombre3 = nombre3.trim();
        System.out.println("****" + nombre3 + "****");
        
        System.out.println("Mayúscula: " + nombre3.toUpperCase());
        System.out.println("Minúscula: " + nombre3.toLowerCase());
        
        //if(nombre3 == "Juan")
        if(nombre3.equals("Juan"))
        {
            System.out.println("Iguales");
        }
        else
            System.out.println("Diferente");
        
        
        String nombre4 = "JuAn";
        if(nombre3.equalsIgnoreCase(nombre4))
        {
            System.out.println("Iguales 2");
        }
        else
            System.out.println("Diferente 2");
        
        String rut = "20.500.600-1";
        System.out.println("Rut     : " + rut);
        String numeroRut = rut.substring(0,10);
        System.out.println("Nro Rut : " + numeroRut);
        
        String numero = numeroRut.replace(".", "");
        System.out.println("numero: " + numero);
        
        // Cambiar el mensaje de una variable: "Hola Mundo!!!" por
        // "chao Mundo!!!"
        
    }
}
