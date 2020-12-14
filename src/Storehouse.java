import java.sql.Struct;
import java.util.HashMap;

public class Storehouse {

    private HashMap<String, Product> store;

    public Storehouse() {
        this.store = new HashMap<>();
    }

    public void addProduct(String product, int prize, int stock){
        store.put(product, new Product(product, prize, stock));
    }

    public int prize (String product){
        if (store.get(product) != null) {
            return store.get(product).getPrize();
        }
        return -99;
    }

    public int stock(String product){
        if (store.get(product) != null) {
            return store.get(product).getStock();
        }
        return 0;
    }

    public boolean take(String product){
        Product item = store.get(product);
        if (item != null && item.getStock() > 0) {
            store.get(product).setStock(store.get(product).getStock() - 1);
            return true;
        }
        return false;
    }

}
