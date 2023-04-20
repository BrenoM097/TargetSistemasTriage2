package Questao3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class JsonReader {

    public String read()   {

       final String CAMINHO = "Q3/Questao3/dados.json";
        File file = new File(CAMINHO);
       
       try {
        Scanner scanner = new Scanner(file);
        String fileContent = scanner.useDelimiter("\\Z").next();
        scanner.close();
        return fileContent;
        
    } catch (FileNotFoundException e) {
        
        e.printStackTrace();
    }
    return "Não deu certo";

   }
    }

