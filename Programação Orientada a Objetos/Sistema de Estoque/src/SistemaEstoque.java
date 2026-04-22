public class SistemaEstoque {
    public static void main(String[] args){
        Estoque estoqueLivros = new Estoque();

        estoqueLivros.adicionarProdutos("A Menina que Roubava Livros", 40);
        estoqueLivros.adicionarProdutos("Dicionário Português", 20);
        estoqueLivros.adicionarProdutos("Musashi", 50);

        System.out.println("Estoque de Livros Atual: ");
        estoqueLivros.listarProdutosEmEstoque();

        System.out.println();

        System.out.println("Estoque de Livros com Tentativa de Alteração: ");
        estoqueLivros.alterarProduto("O Livro dos Cinco Anéis", 55);
        estoqueLivros.listarProdutosEmEstoque();

        System.out.println();

        System.out.println("Estoque de Livros com Alteração: ");
        estoqueLivros.alterarProduto("Musashi", 55);
        estoqueLivros.listarProdutosEmEstoque();
    }
}
