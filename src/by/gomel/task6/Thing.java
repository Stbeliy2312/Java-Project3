package by.gomel.task6;

public class Thing {
    private String title;
    private int weight;
    private double cost;

    protected Thing(String title, int weight, double cost) {
        this.title = title;
        this.weight = weight;
        this.cost = cost;
    }

    protected Thing() {

    }

    protected int getWeight() {
        return weight;
    }

    protected double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return title + '\'' +
                ", weight= " + weight +
                ", cost= " + cost;
    }

}
