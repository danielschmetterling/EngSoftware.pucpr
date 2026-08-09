public class Data{
    private int dia;
    private int mes;
    private int ano;
    private String formato;

    public Data(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
    } // Forma bacaninha que achei

    public void setDia(int dia){
        if (dia >= 1 && dia <= 31){
            this.dia = dia;
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public void setMes(int mes){
        if (mes >= 1 && mes <= 12){
            this.mes = mes;
        } else {
            System.out.println("Mês inválido.");
        }
    }

    public void setAno(int ano){
        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido.");
        }
    }

    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }

    public void definirFormato(String formato){
        this.formato = formato;
    }

    public void imprimir(){
        formato = formato.replace("aaaa", String.format("%04d", ano));
        formato = formato.replace("aa", String.format("%02d", ano % 100));
        
        formato = formato.replace("mm", String.format("%02d", mes));
        formato = formato.replace("m", String.valueOf(mes));
        
        formato = formato.replace("dd", String.format("%02d", dia));
        formato = formato.replace("d", String.valueOf(dia));
        
        System.out.println(formato);

        // Ainda a finalizar. Estou tentando desenvolver uma lógica melhor.
    }
}