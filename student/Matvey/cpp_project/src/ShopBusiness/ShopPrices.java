package ShopBusiness;

import java.util.*;

public class ShopPrices {
    private Map<String, Map<String, Integer>> prices;

    public ShopPrices(){
        Map<String, Map<String, Integer>> temp = new HashMap<>();
        this.prices = temp;
    }


    public void show_prices() {
        for (String product : this.prices.keySet()) {
            System.out.println(product + " :");
            for (String customer : this.prices.get(product).keySet()) {
                System.out.println("           " + customer + ":    " + this.prices.get(product).get(customer));
            }
        }
    }
    /*void show_prices() {
        for (map <string, map<string, int>>::iterator i = this->prices.begin(); i != this->prices.end(); i++) {
            cout << (*i).first << endl;
            for (map<string, int>::iterator j = (*i).second.begin(); j != (*i).second.end(); j++) {
                cout << "          " << (*j).first << ":   " << (*j).second << endl;

            }
        }*/

    public void new_price(String product_name, String customer, int price) {
        //Map<String, Integer> tempmap;
        //tempmap = this.prices.get(product_name);
        //tempmap.put(customer, price);
        //this.prices.put(product_name, tempmap);
        this.prices.get(product_name).put(customer, price);
    }

    public void new_product(String product_name, int a, int b, int c, int d){
        this.prices.put(product_name, new HashMap<>());
        Map<String,Integer> t = this.prices.get(product_name);
        t.put("basic",a);
        t.put("silver",b);
        t.put("gold",c);
        t.put("platinum",d);
        this.prices.put(product_name,t);
    }

    public int get_price(String product, String customer) {
        if (this.prices.containsKey(product)) {
            if (this.prices.get(product).containsKey(customer)) {
                return this.prices.get(product).get(customer);
            }
            System.out.println(product + " has no price for " + customer);
            return -2;
        }
        System.out.println("There is no price for " + product);
        return -1;
    }
    /*void new_price(string  pr, string vis, int disc) {
        this->prices[pr][vis] = disc;
        cout << "New price: product - " << pr << "; group of visitors - " << vis << "; value - " << disc << endl;
    }*/
}
