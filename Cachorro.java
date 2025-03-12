public class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int patas, String raca) {
        super(nome, patas);
        this.raca = raca;
    }

    public void exibirSom() {
        System.out.println("Au au!");
    }
}
