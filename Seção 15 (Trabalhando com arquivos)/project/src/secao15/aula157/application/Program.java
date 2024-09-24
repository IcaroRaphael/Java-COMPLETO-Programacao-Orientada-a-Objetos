package secao15.aula157.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\magna\\Documents\\GitHub\\Java-COMPLETO-Programacao-Orientada-a-Objetos\\Seção 15 (Trabalhando com arquivos)\\project\\src\\secao15\\aula157\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
