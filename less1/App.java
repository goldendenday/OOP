package OOP.less1;

import Domen.Product;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Domen.Product> assort = new ArrayList<Product>();

        Product item1 = new Product("Lays",100);
        Product item2 = new Product("cola",50);

        assort.add(item1);
        assort.add(item2);
    }
}
