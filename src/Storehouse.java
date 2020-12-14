import java.util.HashMap;

public class Storehouse {

    private HashMap<String, Product> store;

    public Storehouse() {
        this.store = new HashMap<>();
    }

    public void addProduct(String product, int prize, int stock){
        store.put(product, new Product(product, prize, stock));
    }

    public int prize (String name){
        if (store.get(name) != null) {
            return store.get(name).getPrize();
        }
        return -99;
    }

}
