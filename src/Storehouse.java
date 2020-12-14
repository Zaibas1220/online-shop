import java.sql.Struct;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class Storehouse {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storehouse that = (Storehouse) o;
        return Objects.equals(store, that.store);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store);
    }

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
            item.setStock(item.getStock() - 1);
            return true;
        }
        return false;
    }

    public Set<String> products(){
        return store.keySet();
    }

}
