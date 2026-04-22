import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<ItemPedido> listaItens;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        listaItens.add(item);
    }

    public void exibirResumo(){
        System.out.println("Cliente: " + cliente.getNome() + " Email: " + cliente.getEmail());
        double totalPedido = 0;
        for (ItemPedido item : listaItens) {
            System.out.println("Produto: " + item.getProduto().getNome() + " Quantidade: " + item.getProduto().getPreco() + " Preço do Produto: " + item.calcularSubtotal());
            totalPedido = totalPedido + item.calcularSubtotal();
        }
        System.out.println("Preço Total: " + totalPedido);
    }
}
