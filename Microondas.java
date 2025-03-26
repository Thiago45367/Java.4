public class Microondas extends Eletrodomestico{
    int tempoMaximo;

    public Microondas(String marca, double potencia, int tempoMaximo) {
        super(marca, potencia);
        this.tempoMaximo = tempoMaximo;
    }

    
    public void Ativar() {
        System.out.println("Microondas " + marca + " Ativado, com tempo máximo de " + tempoMaximo + " minutos.");
    }
}
