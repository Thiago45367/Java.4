public class Eletrodomestico {
    String marca;
    double potencia;

    public Eletrodomestico(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public void Ativar() {
        System.out.println("Eletrodoméstico ativado.");
    }
}
