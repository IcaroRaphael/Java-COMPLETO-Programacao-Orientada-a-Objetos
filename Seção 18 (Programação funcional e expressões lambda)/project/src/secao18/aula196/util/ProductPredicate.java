package secao18.aula196.util;

import secao18.aula196.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate  implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.0;
    }
}
