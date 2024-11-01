package secao17.exercicioFixacao02.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String file = "C:\\Users\\Home\\Documents\\GitHub\\Java-COMPLETO-Programacao-Orientada-a-Objetos\\Seção 17 (Generics, Set, Map)\\project\\src\\secao17\\exercicioFixacao02\\in.csv";

        Map<String, Integer> candidates = new HashMap<>();

        candidates.put("Alex Blue", 0);
        candidates.put("Maria Green", 0);
        candidates.put("Bob Brown", 0);

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                Integer currentVotes = candidates.get(name);
                currentVotes += votes;
                candidates.put(name, currentVotes);

                itemCsv = br.readLine();
            }

            for(String key : candidates.keySet()){
                System.out.println(key + ": " + candidates.get(key));
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
