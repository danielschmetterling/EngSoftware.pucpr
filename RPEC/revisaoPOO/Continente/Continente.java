public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome){
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais){
        paises.add(pais);
    }

    public double dimensaoTotal(){
        double total = 0;

        for (Pais pais : paises){
            total += pais.getDimensao();
        }
        return total;
    }

    public long populacaoTotal(){
        long total = 0;

        for (Pais pais : paises){
            total += pais.getPopulacao();
        }
        return total;
    }

    public double densidadePopulacionalTotal(){
        return populacaoTotal() / dimensaoTotal();
    }

    public Pais maiorPopulacao(){
        Pais maiorPais = paises.get(0);

        for (Pais paisAnalise : paises){
            if (paisAnalise.getPopulacao() > maiorPais.getPopulacao()){
                maiorPais = paisAnalise;
            }
        }
        return maiorPais;
    }

    public Pais menorPopulacao(){
        Pais menorPais = paises.get(0);
        for (Pais paisAnalise : paises){
            if (paisAnalise.getPopulacao() < menorPais.getPopulacao()){
                menorPais = paisAnalise;
            }
        }
        return menorPais;
    }

    public Pais maiorDimensao(){
        Pais maiorPais = paises.get(0);

        for (Pais paisAnalise : paises){
            if (paisAnalise.getDimensao() > maiorPais.getDimensao()){
                maiorPais = paisAnalise;
            }
        }
        return maiorPais;
    }

    public Pais menorDimensao(){
        Pais menorPais = paises.get(0);

        for (Pais paisAnalise : paises){
            if (paisAnalise.getDimensao() < maiorPais.getDimensao()){
                menorPais = paisAnalise;
            }
        }
        return menorPais;
    }

    public double razaoTerritorial(){
        double dimensaoMaior = maiorDimensao().getDimensao();
        double dimensaoMenor = menorDimensao().getDimensao();

        return dimensaoMaior / dimensaoMenor;
    }
}