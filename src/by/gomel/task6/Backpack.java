package by.gomel.task6;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    protected static final int CARRYING_CAPACITY = 10;
    private List<Thing> bestThing = null;
    private double bestCost;

    private int getWeight(List<Thing> things) {
        int result = 0;
        for (Thing thing : things) {
            result += thing.getWeight();
        }
        return result;
    }

    private double getCost(List<Thing> things) {
        double result = 0;
        for (Thing thing : things) {
            result += thing.getWeight();
        }
        return result;
    }

    private void checkSet(List<Thing> things) {
        if (bestThing == null) {
            if (this.getWeight(things) <= CARRYING_CAPACITY) {
                this.bestThing = things;
                this.bestCost = this.getCost(things);
            }
        } else {
            if (this.getWeight(things) <= CARRYING_CAPACITY && this.getCost(things) > this.bestCost) {
                this.bestThing = things;
                this.bestCost = this.getCost(things);
            }
        }
    }

    protected void makeSets(List<Thing> things) {
        if (things.size() > 0) {
            this.checkSet(things);
        }
        for (int i = 0; i < things.size(); i++) {
            List<Thing> newSet = new ArrayList<>(things);
            newSet.remove(i);
            makeSets(newSet);
        }
    }

    protected List<Thing> getBestThing() {
        return bestThing;
    }

    protected void getFullCost(List<Thing> things) {
        double sum = 0;
        for (Thing thing : things) {
            sum += thing.getCost();
        }
        System.out.println("Full cost of things = " + sum);
    }

}

