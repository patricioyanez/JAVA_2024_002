
import java.util.HashSet;
import java.util.Set;


public class Principal {

    public static void main(String[] args) {
        Marca cocacola = new Marca("1-9", "CocaCola", "Juan", "PAC");
        Producto bebida = new Producto();
        bebida.setCodigo(1000);
        bebida.setDescripcion("1 1/2lt vidrio");
        bebida.setPrecio(1500);
        bebida.setStock(20);
        bebida.setMarca(cocacola);
        
        System.out.println("Productos");
        System.out.println(bebida.imprimirDatos());
    }
    
}
