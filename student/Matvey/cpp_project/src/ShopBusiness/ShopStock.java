package ShopBusiness;

import java.util.HashMap;
import java.util.Map;

public class ShopStock {
    private Map<String, Integer> stock;

    public ShopStock() {
        this.stock = new HashMap<>();
    }

    public int get_quantity(String product) {
        return this.stock.get(product);
    }

    public void put_q(String product, int quantity) {
        int t = this.stock.get(product);
        this.stock.put(product, quantity + t);
    }

    public void show_stock() {
        for (String prod : this.stock.keySet()) {
            System.out.println(prod + ":   " + this.stock.get(prod));
        }
    }

    public boolean has_item(String prod) {
        return this.stock.containsKey(prod);
    }

    public void new_product(String prod) {
        this.stock.put(prod, 0);
    }
}
