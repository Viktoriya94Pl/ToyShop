public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        toyShop.addToy(new Toy(1, "car", 10));
        toyShop.addToy(new Toy(2, "doll", 9));
        toyShop.addToy(new Toy(3, "ball", 1));

        toyShop.play();
    }
}
