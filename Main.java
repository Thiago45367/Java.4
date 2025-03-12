    public class Main {
        public static void main(String[] args) {
            
            Funcionario func = new Funcionario("carlinhos", 27, 1559);

            Gerente ger = new Gerente("lucas", 24, 2000, 300);

            System.out.println("O nome do gerente é: "+ger.getNome());
            System.out.println("O nome do funcionario é: "+func.getNome());
        }
    }