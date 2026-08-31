import java.util.ArrayList;

public class Veterinario {
    public static void main(String[] args) {
        ArrayList<Animal> listarAnimais = new ArrayList<>();
        ArrayList<Animal> carrocinha = new ArrayList<>();
        
        Animal animal1 = new Cachorro("Tobi", 5, "Marrom");
        Animal animal2 = new Gato("Pupi", 2, "Preto");
        Animal animal3 = new Cavalo("Herodes", 3, "Baio Escuro");
        
        listarAnimais.add(animal1);
        listarAnimais.add(animal2);
        listarAnimais.add(animal3);  
      
        for (Animal a : listarAnimais){
            a.emitirSom();
            carrocinha.add(a);
            System.out.println(a.getNome() + " colocado na carrocinha.\n");
        }
        
    }
}
