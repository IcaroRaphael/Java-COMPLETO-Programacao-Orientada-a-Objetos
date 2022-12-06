package secao_14.aula_165.application;

import secao_14.aula_165.entities.Circle;
import secao_14.aula_165.entities.Rectangle;
import secao_14.aula_165.entities.Shape;
import secao_14.aula_165.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("- SHAPE #%d DATA:\n", i);
            System.out.print("Rectangle or Circle? [R/C]: ");
            char ch = sc.next().toUpperCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(ch == 'R'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            }else if(ch == 'C'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();

        System.out.println("SHAPES AREAS:");
        for(Shape s : list){
            System.out.printf("%.2f\n", s.area());
        }

        sc.close();
    }
}
