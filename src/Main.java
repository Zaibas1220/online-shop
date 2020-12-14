public class Main {
    public static void main(String[] args) {

        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk:  " + store.prize("milk"));
        System.out.println("coffee:  " + store.prize("coffee"));
        System.out.println("sugar: " + store.prize("sugar"));

    }
}
