public class Diversao {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Erro: Divisão por zero não permitida!");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }

}