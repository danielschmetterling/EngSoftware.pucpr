public class ItemPedido {
    private int quantidade;
    private Produto produto;


    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double calcularSubtotal(){
        return produto.getPreco() * quantidade;
    }
}
