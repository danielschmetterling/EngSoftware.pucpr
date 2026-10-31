import java.util.Random;

public class ReHash {
    private int[] tabela = new int[100];
    private int totalInseridos = 0;
    private int totalColisoes = 0;
    private int[] maisElementos = new int[3];
    private int[] maisColisoes = new int[3];


    public ReHash() {
        for (int i = 0; i < 100; i++){
            tabela[i] = -1;
        }
    }

    public static int funcaoHash(int chave){
        return chave % 100;
    }

    public void inserir(int chave){
        if (totalInseridos >= 90){
            return;
        }

        int posicao = funcaoHash(chave);
        int colisoes = 0;

        while (tabela[posicao] != -1){
            colisoes++;
            totalColisoes++;
            posicao = (posicao + 1) % 100;
        }

        tabela[posicao] = chave;
        totalInseridos++;

        colisoes(chave, colisoes);
    }

    public void colisoes(int chave, int colisoes){
        if (colisoes > maisColisoes[0]){
            maisColisoes[2] = maisColisoes[1];
            maisElementos[2] = maisElementos[1];

            maisColisoes[1] = maisColisoes[0];
            maisElementos[1] = maisElementos[0];

            maisColisoes[0] = colisoes;
            maisElementos[0] = chave;
        } else if (colisoes > maisColisoes[1]){
            maisColisoes[2] = maisColisoes[1];
            maisElementos[2] = maisElementos[1];

            maisColisoes[1] = colisoes;
            maisElementos[1] = chave;
        } else if (colisoes > maisColisoes[2]){
            maisColisoes[2] = colisoes;
            maisElementos[2] = chave;
        }
    }

    public int buscar(int chave){
        int posicao = funcaoHash(chave);
        int saltos = 0;

        while (tabela[posicao] != chave && tabela[posicao] != -1 && saltos < 100){
            posicao = (posicao + 1) % 100;
            saltos++;
        }

        if (tabela[posicao] == chave){
            return posicao;
        } else {
            return -1;
        }
    }   

    public void imprimir() {
        System.out.println("Total elementos inseridos: " + totalInseridos);
        System.out.println("Número total de colisões: " + totalColisoes);

        for (int i = 0; i < 3; i++){
            System.out.println((i + 1) + ": Chave " + maisElementos[i] + " (com " + maisColisoes[i] + " colisões)");
        }

        for (int i = 0; i < 100; i++){
            if (tabela[i] == -1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReHash hash = new ReHash();
        Random random = new Random(1090);

        for (int i = 0; i < 100; i++){
            int valor = random.nextInt(100001);
            hash.inserir(valor);
        }

        hash.imprimir();

        for (int i = 0; i < 3; i++) {
            int chaveProcurada = hash.maisElementos[i];
            int posEncontrada = hash.buscar(chaveProcurada);
            
            if (posEncontrada != -1) {
                System.out.println("Chave " + chaveProcurada + " na posição: " + posEncontrada);
            }
        }
    }
}