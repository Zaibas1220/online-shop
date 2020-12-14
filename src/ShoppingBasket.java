import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> list;

    public ShoppingBasket (){
        this.list = new HashMap<>();
    }

    public void add (String product, int price){
        list.put(product, new Purchase (product, price, 1));
    }

    public int price (){
        int totalPrice = 0;
        for (Purchase product : list.values()){
            totalPrice += product.price();
        }
        return totalPrice;
    }
}
