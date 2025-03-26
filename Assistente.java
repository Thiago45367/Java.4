public class Assistente extends Funcionario2{
    public Assistente(String nome, double salario) {
        super(nome, salario, "Assistente");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.05; // Bônus de 5% do salário
    }
}
