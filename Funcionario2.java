public class Funcionario2 {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario2(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método para ser sobrescrito nas subclasses, se necessário
    public double calcularBonus() {
        return 0; // Bônus padrão é zero
    }
}
