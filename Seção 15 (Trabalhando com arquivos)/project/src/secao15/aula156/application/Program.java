package secao15.aula156.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\magna\\Documents\\GitHub\\Java-COMPLETO-Programacao-Orientada-a-Objetos\\java-completo\\src\\secao15\\aula156\\in.txt";
        FileReader fr =  null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br =  new BufferedReader(fr);

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if(br !=  null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
