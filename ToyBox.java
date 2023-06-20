import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyBox {
    private List<Toy> toys = new ArrayList<>();
    private double totalFrequency = 0;

    public void addToy(Toy toy) {
        toys.add(toy);
        totalFrequency += toy.getFrequency();
    }

    public Toy getRandomToy(double frequency) throws Exception {
        if (toys.isEmpty()) {
            throw new Exception("Toy box is empty");
        }

        if (frequency <= 0 || frequency > totalFrequency) {
            throw new Exception("Invalid weight");
        }

        Random random = new Random();
        Toy chosenToy = null;
        double currentFrequency = 0;

        while (chosenToy == null) {
            Toy toy = toys.get(random.nextInt(toys.size()));
            currentFrequency += toy.getFrequency();
            if (currentFrequency >= frequency) {
                chosenToy = toy;
            }
        }

        totalFrequency -= chosenToy.getFrequency();
        toys.remove(chosenToy);
        return chosenToy;
    }
}