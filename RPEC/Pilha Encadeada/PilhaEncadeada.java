public class PilhaEncadeada{
    class No{
        int valor;
        No proximo;

        public No(int valor){
            this.valor = valor;
            this.proximo = null;
        }
    }
    No topo = null;

    public void Empilhar(int valor){
        No novoNo = new No(valor);
        if (topo == null){
            topo = novoNo;
            return;
        } else {
            novoNo.proximo = topo;
            topo = novoNo;
        }
    }

    public int Remover(){
        if (topo == null){
            return;
        }
        int valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }
}