import java.util.ArrayList;

/*
    Realizar el ejercicio 2.1.2

*/

public class Principal {

    public static void main(String[] args) {
        // 211, 221, 231
        //Animal a = new Animal(); // error
        
        Ave pollo = new Ave();
        pollo.comer();
        
        Pez salmon = new Pez();
        salmon.comer();
        
        
        ArrayList<Animal> zoologico = new ArrayList<Animal>();
        
        zoologico.add(pollo);
        zoologico.add(salmon);
        
        System.out.println("========== Polimorfismo ==========");
        for(Animal animal: zoologico)
        {
            animal.comer();
            
            if(animal instanceof Ave)
            {
                ((Ave) animal).mover();
            }
            
            animal.grabar();
            animal.limpiar();
        }
    }
    
}
