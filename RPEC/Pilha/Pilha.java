public class Pilha{
    private int dados[];
    private int capacidade;
    private int topo;

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    public boolean Cheia(){
        if (topo == capacidade - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean Vazia(){
        if (topo == -1){
            return true;
        } else {
            return false;
        }
    }

    public void Empilhar(int valor){
        if (Cheia() == true){
            System.out.println("A pilha já está cheia.");
        } else {
            while (indice >= 0){
            topo = topo + 1;
            dados[topo] = valor;
            }
        }
    }

    public void Desempilhar(){
        if (Vazia() == true){
            System.out.println("A pilha já está vazia");
        } else {
            topo = topo - 1;
        }
    } // Pelo visto o elemento ainda não é removido, mas o importante é não listar os que está acima do topo.

    public void Imprimir(){
        if (Vazia() == true){
            System.out.println("A pilha está vazia");
        } else {
            int indice = topo;
            System.out.println(dados[indice]);
            indice = indice - 1;
        }
    }
}