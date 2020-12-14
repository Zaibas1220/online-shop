public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int ammount, int unitPrice) {
        this.product = product;
        this.amount = ammount;
        this.unitPrice = unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.amount;
    }

    public int price(){
        return this.amount*this.unitPrice;
    }

    public void increaseAmount(){
        this.amount++;
    }
}
