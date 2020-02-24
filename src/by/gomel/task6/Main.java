package by.gomel.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Book", 3, 50.00));
        things.add(new Thing("Thermos", 3, 120.00));
        things.add(new Thing("First-aid kid", 4, 150.00));
        things.add(new Thing("Notebook", 2, 20.00));
        things.add(new Thing("Pencil", 1, 5.00));

        Backpack backpack = new Backpack();
        backpack.makeSets(things);
        System.out.println("All things:" + '\n' + things);
        System.out.println("Best set of things:" + '\n' + backpack.getBestThing());
        backpack.getFullCost(backpack.getBestThing());
    }
}
