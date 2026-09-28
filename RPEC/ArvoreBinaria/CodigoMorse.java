public class CodigoMorse {
    No raiz;
    public class No {
        char caractere;
        No esquerda;
        No direita;
        
        public No(char caractere){
            this.caractere = caractere;
            this.esquerda = null;
            this.direita = null;
        }
    }

    public void inicializar(){
        raiz = new No(' ');

        inserir(".-", 'A');
        inserir("-...", 'B');
        inserir("-.-.", 'C');
        inserir("-..", 'D');
        inserir(".", 'E');
        inserir("..-.", 'F');
        inserir("--.", 'G');
        inserir("....", 'H');
        inserir("..", 'I');
        inserir(".---", 'J');
        inserir("-.-", 'K');
        inserir(".-..", 'L');
        inserir("--", 'M');
        inserir("-.", 'N');
        inserir("---", 'O');
        inserir(".--.", 'P');
        inserir("--.-", 'Q');
        inserir(".-.", 'R');
        inserir("...", 'S');
        inserir("-", 'T');
        inserir("..-", 'U');
        inserir("...-", 'V');
        inserir(".--", 'W');
        inserir("-..-", 'X');
        inserir("-.--", 'Y');
        inserir("--..", 'Z');
        inserir("-----", '0');
        inserir(".----", '1');
        inserir("..---", '2');
        inserir("...--", '3');
        inserir("....-", '4');
        inserir(".....", '5');
        inserir("-....", '6');
        inserir("--...", '7');
        inserir("---..", '8');
        inserir("----.", '9');
    }

    public void inserir(String codigo_morse, char caractere){
        No noAtual = raiz;

        for (int i = 0; i < codigo_morse.length(); i++){
            char simbolo = codigo_morse.charAt(i);

            if (simbolo == '.'){
                if (noAtual.esquerda == null){
                    noAtual.esquerda = new No(' ');
                }
                noAtual = noAtual.esquerda;
            }
            else if (simbolo == '-'){
                if (noAtual.direita == null){
                    noAtual.direita = new No(' ');
                }
                noAtual = noAtual.direita;
            }
        }
        noAtual.caractere = caractere;
    }

    public char buscarCaractere(String codigo_morse){
        No noAtual = raiz;

        for (int i = 0; i < codigo_morse.length(); i++){
            char simbolo = codigo_morse.charAt(i);

            if (simbolo == '.'){
                noAtual = noAtual.esquerda;
            }
            else if (simbolo == '-'){
                noAtual = noAtual.direita;
            }
            if (noAtual == null) {
                return ' ';
            }
        }
        return noAtual.caractere;
    }

    public static void main(String args[]){
        CodigoMorse arvore = new CodigoMorse();

        arvore.inicializar();
        System.out.println("Buscar '...': " + arvore.buscarCaractere("..."));
        System.out.println("Buscar '----.': " + arvore.buscarCaractere("----."));
        System.out.println("Buscar '..--.--.-.--..-.-.': " + arvore.buscarCaractere("..--.--.-.--..-.-."));
    }
}