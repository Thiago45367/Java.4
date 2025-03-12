class Gato extends Animal {
    String cor;

    public Gato(String nome, int patas, String cor) {
        super(nome, patas);
        this.cor = cor;
    }

    public void exibirSom() {
        System.out.println("Miau!");
    }
    
}