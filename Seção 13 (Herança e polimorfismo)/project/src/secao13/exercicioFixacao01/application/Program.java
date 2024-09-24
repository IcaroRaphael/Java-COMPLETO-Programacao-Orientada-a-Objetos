package secao13.exercicioFixacao01.application;

import secao13.exercicioFixacao01.entities.ImportedProduct;
import secao13.exercicioFixacao01.entities.Product;
import secao13.exercicioFixacao01.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i=1; i<= n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(ch == 'c'){
                products.add(new Product(name, price));
            }
            else if(ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, date));
            }
            else if(ch == 'i'){
                System.out.print("Customs fee: ");
                Double customFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            }
        }
        System.out.println();

        System.out.println("PRICE TAGS");
        for(Product p : products){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
