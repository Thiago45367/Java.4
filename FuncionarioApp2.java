public class FuncionarioApp2 {
    public static void main(String[] args) {
        // Cria instâncias das subclasses
        Gerente2 gerente = new Gerente2("João", 5000.00);
        Assistente assistente = new Assistente("Maria", 2000.00);

        // Exibe os bônus
        System.out.println("Bônus do Gerente " + gerente.getNome() + ": R$" + gerente.getBonus());
        System.out.println("Bônus do Assistente " + assistente.getNome() + ": R$" + assistente.calcularBonus());
    }
}
