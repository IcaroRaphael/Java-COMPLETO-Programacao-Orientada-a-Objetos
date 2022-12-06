package secao_07.aula_058;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int n = sc.nextInt();

        int mask = 0b00100000;

        if((n & mask) != 0){
            System.out.println("6º bit vale 1.");
        }else{
            System.out.println("6º bit vale 0.");
        }

        sc.close();
    }
}
