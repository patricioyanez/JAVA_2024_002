
public class Principal {

    public static void main(String[] args) {
        Electronico e1 = new Electronico("Sonya", 10, "100", "SmartTV", 100000.0);
        Ropa r1 = new Ropa("s", "Blanco", "101", "polera", 10000.0);
        
        r1.ajustarTalla("xxl2");
        System.out.println(r1);
        
        
    }
    
}
