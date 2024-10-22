
public class Principal {

    public static void main(String[] args) {
        Auto auto1 = new Auto(5, 350, "zads20", "Juan", "Lada", "LAdita", 20000, 0);
        Moto moto1 = new Moto("Scooter", 50, "as5002", "Ana", "Suzuki", "sport", 50500, 0);
        
        Taller taller = new Taller();
        
        taller.guardar(auto1);
        taller.guardar(moto1);
        
        System.out.println("Total por pagar patente zads20:");
        auto1.obtenerDescuento();
        auto1.totalConIVA();
        auto1.totalPorPagar();
        System.out.println(auto1);
        
        System.out.println("");
        taller.listar();
        
        System.out.println("");
        taller.contabilidar();
    }
    
}
