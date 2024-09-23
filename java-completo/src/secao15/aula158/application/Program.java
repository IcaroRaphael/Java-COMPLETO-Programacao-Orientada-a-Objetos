package secao15.aula158.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\magna\\Documents\\GitHub\\Java-COMPLETO-Programacao-Orientada-a-Objetos\\java-completo\\src\\secao15\\aula158\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
