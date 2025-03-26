public class ProdutoApp {
    public static void main(String[] args) {
        // Cria um produto
        Produto produto = new Produto("Laptop", 1200.00, 10);

        // Exibe o valor total de estoque
        System.out.println("Valor total de estoque: R$" + produto.calcularValorTotal());

        // Altera os atributos do produto
        produto.setPreco(1300.00);
        produto.setQuantidade(15);

        // Exibe o novo valor total de estoque
        System.out.println("Novo valor total de estoque: R$" + produto.calcularValorTotal());
    }
}
