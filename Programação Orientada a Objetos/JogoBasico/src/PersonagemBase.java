public abstract class PersonagemBase {
    protected String nome;
    protected int vida;

    public PersonagemBase(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void Atacar(PersonagemBase inimigo);

    public void mostrarStatus(){
        System.out.println("Nome: " + nome + " -- Vida: "+ vida);
    }

    public void sofrerDano(int nivelDano){
        this.vida -= nivelDano;
        System.out.println(this.nome + " sofreu " + nivelDano + " pontos de dano.");

        if (this.vida < 0){
            this.vida = 0;
        }
        this.mostrarStatus();
        if (this.vida == 0){
            System.out.println("Morreu.");
        }
    }

}