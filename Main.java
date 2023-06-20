public class Main {
    public static void main(String[] args) {
        ToyBox toyBox = new ToyBox();

        Toy toy1 = new Toy(1, "Bea", 1, 25);
        Toy toy2 = new Toy(2, "Picachu", 4, 18);
        Toy toy3 = new Toy(3, "Lego", 6, 57);

        toyBox.addToy(toy1);
        toyBox.addToy(toy2);
        toyBox.addToy(toy3);

        try {
            // Choose a random toy with weight of 1.0
            Toy chosenToy = toyBox.getRandomToy(10);
            System.out.println("The winner is: " + chosenToy.getName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}