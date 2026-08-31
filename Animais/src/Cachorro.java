public class Cachorro extends Animal {
    public Cachorro(String nome, int idade, String cor){
        super(nome, idade, cor);
    }
    @Override
    public void emitirSom(){
        System.out.println(getNome() + " esta latindo: Au au au!");
    }
}
