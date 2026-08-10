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
        counterD = 0;
        counterM = 0;
        counterA = 0;
        stringD = "%0xd";
        stringM = "%0xd";
        stringA = "%0xd";

        for (int = 0; i < formato.length(); i++){
            char letra = formato.charAt(i);
            if (letra == "d"){
                counterD += 1;
            }
            if (letra == "m"){
                counterM += 1;
            }
            if (letra == "a"){
                counterA += 1;
            }
        }
        char[] charsA = new char[counterA];
        java.util.Arrays.fill(charsA, 'a');
        String resultadoA = new String(charsA);
        char[] charsM = new char[counterM];
        java.util.Arrays.fill(charsM, 'm');
        String resultadoM = new String(charsM);
        char[] charsD = new char[counterD];
        java.util.Arrays.fill(charsD, 'd');
        String resultadoD = new String(charsD);
        
        String stringD = stringD.replace("x", counterD);
        String stringM = stringM.replace("x", counterM);
        String stringA = stringA.replace("x", counterA);

        if (countera != 4){
            formato = formato.replace(resultadoA, String.format(stringA, ano % 100));
        } else {
            formato = formato.replace(resultadoA, String.format(stringA, ano));
        }
        
        formato = formato.replace(resultadoM, String.format(stringM, mes));
    
        formato = formato.replace(resultadoD, String.format(stringD, dia));
        
        System.out.println(formato);

        // Ainda a finalizar. Estou tentando desenvolver uma lógica melhor.
    }
}