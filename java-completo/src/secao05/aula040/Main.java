package secao05.aula040;

public class Main {
    public static void main(String[] args) {
        double price = 400.0;

        double discount;

        if(price < 200){
            discount = price * 0.1;
        }
        else{
            discount = 0;
        }

        System.out.println(discount);
    }
}
