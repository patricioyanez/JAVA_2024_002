
public class Principal {

    public static void main(String[] args) {
        Marca marca1 = new Marca("1-9", "CocaCola", "Juan", "PAC");
        Marca marca2 = new Marca("2-7", "Pepsi", "Diego", "Quilicura");
        Producto bebida = new Producto();
        bebida.setCodigo(1000);
        bebida.setDescripcion("1 1/2lt vidrio");
        bebida.setPrecio(1500);
        bebida.setStock(20);
        bebida.setMarca(marca1);
        
        Producto bebida2 = new Producto(2000, "Bebida en lata 350cc", marca2, 700, 10);
        System.out.println("Productos");
        System.out.println(bebida.imprimirDatos());
        System.out.println(bebida2.imprimirDatos());
    }
    
}
