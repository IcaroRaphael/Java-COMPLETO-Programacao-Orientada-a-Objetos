package secao04.aula025;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        String s = sc.next();
//        System.out.println("Você digitou: " + s);
//
//        int i = sc.nextInt();
//        System.out.println("Você digitou: " + i);
//
//        double d = sc.nextDouble();
//        System.out.printf("Você digitou: %.2f\n", d);
//
//        char c = sc.next().charAt(0);
//        System.out.println("Você digitou: " + c);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
