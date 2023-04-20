package Q4;

import java.text.DecimalFormat;

public class Questao4 {
    public static void main(String[] args) {
        Double SP = 67836.43;
        Double RJ = 36678.66;
        Double MG = 29229.88;
        Double ES = 27165.48;
        Double Outros = 19849.53;

        DecimalFormat df = new DecimalFormat("#.##");
        Double faturamentoMensalTotal = SP + RJ + MG + ES + Outros;

        System.out.println("O percentual de representação de SP no faturamento mensal é de " + df.format((SP*100) / faturamentoMensalTotal) + "%");
        System.out.println("O percentual de representação de RJ no faturamento mensal é de " + df.format((RJ*100) / faturamentoMensalTotal) + "%");
        System.out.println("O percentual de representação de MG no faturamento mensal é de " + df.format((MG*100) / faturamentoMensalTotal) + "%");
        System.out.println("O percentual de representação de ES no faturamento mensal é de " + df.format((ES*100) / faturamentoMensalTotal) + "%");
        System.out.println("O percentual de representação dos demais estados no faturamento mensal é de " + df.format((Outros*100) / faturamentoMensalTotal) + "%");
        

    }
}
