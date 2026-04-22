import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> listaProdutos;

    public Estoque(){
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProdutos(String nome, double preco){
        Produto novo = new Produto(nome, preco);
        listaProdutos.add(novo);
    }

    public void alterarProduto(String nome, double novoPreco){
        boolean encontrado = false;
        for (Produto item : listaProdutos){
            if (item.getNome().equals(nome)){
                item.setPreco(novoPreco);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false){
            System.out.println("Produto não encontrado.");
        }
    }

    public void listarProdutosEmEstoque(){
        for (Produto item : listaProdutos){
            System.out.println("Produto: " + item.getNome() + " Preço: " + item.getPreco());
        }
    }
}
