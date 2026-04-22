public class ProgramaPrincipal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Daniel Felix", "danielfelix@email.com");
        Cliente cliente2 = new Cliente("Gabriel Teodoro", "gabrielteodoro@email.com");

        Produto produto1 = new Produto("Batata", 2);
        Produto produto2 = new Produto("Cenoura", 3);
        Produto produto3 = new Produto("Kiwi", 4);
        Produto produto4 = new Produto("Maça", 5);

        Pedido pedido1 = new Pedido(cliente1);
        Pedido pedido2 = new Pedido(cliente2);

        ItemPedido item1 = new ItemPedido(produto1, 3);
        ItemPedido item2 = new ItemPedido(produto3, 2);

        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);

        ItemPedido item3 = new ItemPedido(produto2, 5);
        ItemPedido item4 = new ItemPedido(produto4, 1);
        pedido2.adicionarItem(item3);
        pedido2.adicionarItem(item4);

        System.out.println("Resumo das Vendas do Dia:\n");
        pedido1.exibirResumo();
        pedido2.exibirResumo();
    }
}
