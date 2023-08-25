package OOP.less1.Services;

import java.util.List;

import Domen.Product;

public class VendingMachine {
    private Services.Holder holder;
    private Services.CoinDispenser dispenser;
    private List<Product> productList;

    public VendingMachine(Services.Holder holder, Services.CoinDispenser dispenser, List<Product> productList) {
        this.holder = holder;
        this.dispenser = dispenser;
        this.productList = productList;
    }

    public Product buyProduct(int index) {
        return productList.get(index);
    }

    public void release() {

    }

    public List<Product> getProductList() {
        return productList;
    }
}