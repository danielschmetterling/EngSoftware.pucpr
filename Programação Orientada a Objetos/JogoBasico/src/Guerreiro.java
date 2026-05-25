public class Guerreiro extends PersonagemBase implements CouracaGolpeEspecial{

    public Guerreiro(String nome, int vida){
        super(nome, vida);
    }

    @Override
    public void Atacar(PersonagemBase inimigo){
        System.out.println(this.nome + " causou 10 pontos de dano com a espada ao inimigo.");
        inimigo.sofrerDano(10);
    }

    @Override
    public void atacarGolpeEspecial(PersonagemBase inimigo){
        System.out.println(this.nome + " causou 30 pontos de dano com o Golpe de Thor (com espada) ao inimigo.");
        inimigo.sofrerDano(30);
    }
}
