public class Product {
    private String name;
    private int prize;
    private int stock;

    public Product(String name, int prize, int stock) {
        this.name = name;
        this.prize = prize;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product: " + this.name + ", " +
                this.prize + "$, " + this.stock;
    }
}
