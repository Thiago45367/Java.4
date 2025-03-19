public class ExemploTratamento {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;  // vai gerar uma execeção (divisão por zero)
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não permitida");
        } finally {
            System.out.println("Finalizando o programa");
        }
    }
}
