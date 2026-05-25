public class Arena {
    public static void main(String[] args){
        PersonagemBase guerreiro = new Guerreiro("Brutus Insanus",100);
        PersonagemBase mago = new Mago("Mago Louco", 35);

        guerreiro.mostrarStatus();
        mago.mostrarStatus();

        guerreiro.Atacar(mago);
        mago.Atacar(guerreiro);
        ((CouracaGolpeEspecial)guerreiro).atacarGolpeEspecial(mago);
        ((CouracaGolpeEspecial) mago).atacarGolpeEspecial(guerreiro);

        guerreiro.mostrarStatus();
        mago.mostrarStatus();

    }
}
