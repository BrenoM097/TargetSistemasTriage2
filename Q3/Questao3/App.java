package Questao3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App{
    public static void main(String[] args) {
             
        JsonReader jsonReader = new JsonReader();
        String jsonContent = jsonReader.read();
        Double maiorFaturamento = Double.MIN_VALUE;
        Double menorFaturamento = Double.MAX_VALUE;
        int diaDoMenorFaturamento = 0;
        Double mediaDoFaturamentoMensal = 0d;
        int diaDoMaiorFaturamento = 0;
        int numeroDeDiasFaturamentoMaiorQueMedia = 0;
        
        

        Parser parser = new Parser();
        List<Map<String, String>> jsonList = parser.parse(jsonContent);
        Map<Integer, Double> dados = new HashMap<>();

        for(Map<String, String> x : jsonList) {
            Integer dia = Integer.parseInt(x.get("dia"));
            Double valor = Double.parseDouble(x.get("valor"));
            dados.put(dia, valor);
        }
        
        for (int i = 1; i < dados.size(); i++) {
            Double item = dados.get(i);

            if (item > maiorFaturamento && item != 0.0) {
                maiorFaturamento = item;
                diaDoMaiorFaturamento = i;
            }

            if(item < menorFaturamento && item != 0) {
                menorFaturamento = item;
                diaDoMenorFaturamento = i;
            }

            mediaDoFaturamentoMensal += item / dados.size();
            
        }
       
        for(Double n : dados.values()) {
            if(n < mediaDoFaturamentoMensal) {
                numeroDeDiasFaturamentoMaiorQueMedia++;
            }
        }
        System.out.println("O maior faturamento foi no dia: " + diaDoMaiorFaturamento + " e vou no valor de " + maiorFaturamento);
        System.out.println("O menor faturamento foi no dia: " + diaDoMenorFaturamento + " e vou no valor de " + menorFaturamento);
        System.out.println("Teve " + numeroDeDiasFaturamentoMaiorQueMedia + " dias que o faturamento diario foi maior que a média mensal.");
        
    }
}