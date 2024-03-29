package Questao3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final Pattern REGEX_ATRIBUTOS_JSON = Pattern.compile("\"([^\"]+)\":\\s*([^,]+)");

    public List<Map<String, String>> parse(String json) {
        
        String[] items = json.split(",\\s*\\{");
        
        
        List<Map<String, String>> dados = new ArrayList<>();

        for (String item : items) {
            Map<String, String> atributosItem = new HashMap<>();

            Matcher matcherAtributosJson = REGEX_ATRIBUTOS_JSON.matcher(item);
            while (matcherAtributosJson.find()) {
                String atributo = matcherAtributosJson.group(1);
                String valor = matcherAtributosJson.group(2).replaceAll("[\\{\\}\\[\\]]", "");
                atributosItem.put(atributo, valor);
            }

            
            dados.add(atributosItem);
        }

        return dados;
    }
}

