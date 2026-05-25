public class Mago extends PersonagemBase implements CouracaGolpeEspecial {
    public Mago(String nome, int vida){
        super(nome, vida);
    }

    @Override
    public void Atacar(PersonagemBase inimigo){
        System.out.println(this.nome + " conjurou Abracadabra, causando 5 pontos de dano ao inimigo.");
        inimigo.sofrerDano(5);
    }

    @Override
    public void atacarGolpeEspecial(PersonagemBase inimigo){
        System.out.println(this.nome + " conjurou o Feitiço de Merlin, causando 50 pontos de dano ao inimigo.");
        inimigo.sofrerDano(50);
    }
}
