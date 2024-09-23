
public class Principal {

    public static void main(String[] args) {
        Componente CPU = new Componente(1, "Pentium", "Pentium 4", "intel", 150000, 2000);
        Componente RAM = new Componente(2, "DDR4 PC-4200", "DDR4", "kingston",6000, 4200);
        Componente SSD = new Componente(5, "SSD 300B/s", "AS400", "Kingston", 30000, 300);
        
        Cliente cliente1 = new Cliente("1-9", "Juan", 46546654, "juan@email.com", "Vespucio 1501");
        Cliente cliente2 = new Cliente("2-7", "Ana", 46646654, "ana@email.com", "Vespucio 1501");
        
        System.out.println(CPU.imprimirDatos());
        System.out.println(RAM.imprimirDatos());
        System.out.println(SSD.imprimirDatos());
        System.out.println(cliente1.imprimirDatos());
        System.out.println(cliente2.imprimirDatos());
        
        
        
        
    }
    
}
