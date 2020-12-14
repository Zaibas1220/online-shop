public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int ammount, int unitPrice) {
        this.product = product;
        this.amount = ammount;
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
