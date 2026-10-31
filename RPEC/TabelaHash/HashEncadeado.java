import java.util.Random;

public class HashEncadeado {
    private int tamanho;

    class No {
        int chave;
        No proximo;

        public No(int chave){
            this.chave = chave;
            this.proximo = null;
        }
    }

    private No[] tabela = new No[100];
    private int[] ultimosTres = new int[3];

    public static int funcaoHash(int chave){
        return chave % 100;
    }

    private void inserir(int chave){
        int pos = funcaoHash(chave);
        No novoNo = new No(chave);

        if (tabela[pos] == null){
            tabela[pos] = novoNo;
        } else {
            No atual = tabela[pos];
            while(atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novoNo;

            ultimosTres[0] = ultimosTres[1];
            ultimosTres[1] = ultimosTres[2];
            ultimosTres[2] = chave;
        }
    }

    public void analisarTabela(){
        int posicoesVazias = 0;
        int totalListas = 0;
        int maiorTamanho = 0;
        int posicaoMaiorLista = -1;
        No inicioMaiorLista = null;

        for (int i = 0; i < 100; i++){
            if (tabela[i] == null){
                posicoesVazias++;
            } else {
                if (tabela[i].proximo != null){
                    totalListas++;
                }

                int tamanhoAtual = 0;
                No atual = tabela[i];
                while (atual != null){
                    tamanhoAtual++;
                    atual = atual.proximo;
                }
                
                if (tamanhoAtual > maiorTamanho) {
                    maiorTamanho = tamanhoAtual;
                    posicaoMaiorLista = i;
                    inicioMaiorLista = tabela[i];
                }
            }
            System.out.println("Posições Vazias: " + posicoesVazias);
            System.out.println("Listas Encadeados: " + totalListas);
            System.out.println("Tamanho da Maior Lista: " + maiorTamanho + " na posição " + posicaoMaiorLista);
            
            No temp = inicioMaiorLista;
            while (temp != null){
                System.out.print(temp.chave);
                if (temp.proximo != null){
                    System.out.print(", ");
                }
                temp = temp.proximo;
            }
            System.out.println();

            System.out.println("Três últimos valores: " + ultimosTres[0] + ", " + ultimosTres[1] + ", " + ultimosTres[2]);
        }
    }

    public static void main(String args[]){
        HashEncadeado hash = new HashEncadeado();
        Random random = new Random(1090);
        for (int i = 0; i < 1000; i++){
            int valor = random.nextInt(100001);
            hash.inserir(valor);
        }

        hash.analisarTabela();
    }
}