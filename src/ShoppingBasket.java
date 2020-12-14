import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> list;

    public ShoppingBasket(){
        this.list = new HashMap<>();
    }

    public void add(String product, int price) {
        if (list.get(product) != null) {
            list.get(product).increaseAmount();
        } else {
            list.put(product, new Purchase(product, 1, price));
        }
    }

    public int price(){
        int totalPrice = 0;
        for (Purchase product : list.values()){
            totalPrice += product.price();
        }
        return totalPrice;
    }

    public void print(){
        for (Purchase product : list.values()){
            System.out.println(product.getProduct() + ": " + product.getAmount());
        }
    }
}
