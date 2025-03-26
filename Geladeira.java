public class Geladeira extends Eletrodomestico{
    double capacidade;

    public Geladeira(String marca, double potencia, double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }

    
    public void Ativar() {
        System.out.println("Geladeira " + marca + " Ativado, mantendo " + capacidade + " litros resfriados.");
    }
}
