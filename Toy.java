public class Toy {
    private Integer id;
    private String name;
    private Integer quantity;
    private double frequency;

    public Toy(Integer id, String name, Integer quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public Integer getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public double getFrequency() {
        return frequency;
    }
}