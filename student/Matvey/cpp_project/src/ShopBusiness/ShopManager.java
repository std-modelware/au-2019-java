package ShopBusiness;

import java.util.Map;

public class ShopManager {
    private ShopStock stock;
    private ShopPrices prices;
    private int money;

    private int get_quantity(String product) {
        return this.stock.get_quantity(product);
    }

    public ShopManager(ShopStock stock, ShopPrices prices) {
        this.stock = stock;
        this.prices = prices;
        this.money = 0;
    }

    public ShopManager(int money) {
        this.stock = new ShopStock();
        this.prices = new ShopPrices();
        this.money = money;
    }

    public ShopManager() {
        this.stock = new ShopStock();
        this.prices = new ShopPrices();
        this.money = 0;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public int getMoney(){
        System.out.println(this.money);
        return this.money;
    }
    public void newPrice(String product_name, String customer, int price) {
        this.prices.new_price(product_name, customer, price);
    }

    public void showPrices() {
        this.prices.show_prices();
    }

    public int getPrice(String product, String customer) {
        return this.prices.get_price(product, customer);
    }

    public boolean order(String product, Integer quantity) {
        if (this.prices.get_price(product, "basic") <= 0) {
            return false;
        }
        if (this.money >= (this.getPrice(product, "platinum")-1) * quantity) {
            Integer t = this.getPrice(product, "platinum");
            this.money -= (t-1) * quantity;
            Integer t1 = this.get_quantity(product);
            this.stock.put_q(product, t1 + quantity);
            return true;
        }
        System.out.println("Low of money");
        return false;
    }

    public boolean sell(String product, Guest name, int how_much) {
        String s = name.getName();
        if (this.stock.get_quantity(product) >= how_much) {
            this.money += this.prices.get_price(product, s) * how_much;
            int t = this.stock.get_quantity(product);
            this.stock.put_q(product, t - how_much);
            String a = name.getName();
            name.addstory(how_much * this.getPrice(product, s));
            System.out.println("Sold "+how_much+" of "+product+" to "+a);
            return true;
        }
        System.out.println("Low of " + product);
        return false;
    }
    public boolean sell(String product, int how_much){
        return this.sell(product, new Guest(), how_much);
    }

    public void showStock() {
        this.stock.show_stock();
    }

    public boolean addProduct(String prod, int basic, int silver, int gold, int platinum) {
        if (this.stock.has_item(prod)) {
            System.out.println(prod + "sure does already exist");
            return false;
        }
        this.prices.new_product(prod, basic, silver, gold, platinum);
        this.stock.new_product(prod);
        System.out.println("Added product "+prod);
        return true;
    }


    public static void main(String[] args) {
        System.out.println("====Main");

        ShopManager shop = new ShopManager(10000);

        shop.addProduct("Apple",40,38,36,36);
        shop.addProduct("Carrot",20,18,15,12);
        shop.order("Apple", 150);
        shop.order("Carrot", 50);

        shop.getMoney();
        shop.showStock();
        shop.newPrice("Carrot", "silver", 17);
        shop.showPrices();

        Guest g1 = new Guest();
        shop.sell("Apple", g1, 100);

        System.out.println(g1.getName());
        shop.getMoney();

        System.out.println("====Main ended");
    }
}
