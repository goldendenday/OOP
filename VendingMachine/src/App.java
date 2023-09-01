package OOP.VendingMachine.src;

import java.util.ArrayList;
import java.util.List;

import OOP.VendingMachine.src.Domen.Bottle;
import OOP.VendingMachine.src.Domen.Product;
import OOP.VendingMachine.src.Services.Holder;
import OOP.VendingMachine.src.Services.VendingMachine;
import OOP.VendingMachine.src.Services.CoinDispenser;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<Product>(); 

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("cola", 50);
        Product item3 = new Bottle("Mineral water", 101, 1.5);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        Holder hold1 = new Holder(10, 10);
        CoinDispenser disp = new CoinDispenser(120);

        VendingMachine venMach1 = new VendingMachine(hold1, disp, assort);

        for(Product prod: venMach1.getProductList())
        {
            System.out.println(prod);
        }
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
