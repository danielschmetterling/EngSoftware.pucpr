public class Pais{
    private String codigo;
    private String nome;
    private long populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    public Pais(String codigo, String nome, double dimensao){
        this.codigo = codigo;
        this.nome = nome;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public long getPopulacao() {
        return populacao;
    }
    public double getDimensao() {
        return dimensao;
    }
    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    public boolean mesmoPais(Pais outroPais){
        if (this.codigo.equals(outroPais.codigo)){
            return true;
        } else {
            return false;
        }
    }

    public boolean fazFronteira(Pais outroPais){
        for (Pais vizinho : fronteiras){
            if (vizinho.mesmoPais(outroPais)){
                return true;
            }
        }
        return false;
    }

    public double densidadePopulacional(){
        return populacao / dimensao;
    }

    public List<Pais> listaVizinhos(Pais outroPais){
        List<Pais> vizinhosComum = new ArrayList<>();

        for(Pais vizinho : fronteiras){
            if(outroPais.fazFronteira(vizinho)){
                vinhosComum.add(vizinho);
            }
        }
        
        return vizinhosComum;
    }
}