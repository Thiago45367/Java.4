public class Gerente2 extends Funcionario2 {
    private double bonus;

    public Gerente2(String nome, double salario) {
        super(nome, salario, "Gerente");
        this.bonus = calcularBonus();
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.10; // Bônus de 10% do salário
    }
}

