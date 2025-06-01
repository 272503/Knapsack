package org.example;


import java.util.*;

public class Problem {
    private final List<Item> items = new ArrayList<>();
    private final Random random;

    public Problem(int n, int seed, int lowerBound, int upperBound) {
        this.random = new Random(seed);
        for (int i = 0; i < n; i++) {
            int weight = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int value = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            items.add(new Item(i, weight, value));
        }
    }

    public Result solve(int capacity) {
        List<Item> sorted = new ArrayList<>(items);
        sorted.sort((a, b) -> Double.compare(b.ratio(), a.ratio()));

        Result result = new Result();
        int remainingCapacity = capacity;

        for (Item item : sorted) {
            if (item.weight > remainingCapacity) continue;
            int count = remainingCapacity / item.weight;
            result.addItem(item, count);
            remainingCapacity -= count * item.weight;
        }

        return result;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Items:\n");
        for (Item item : items) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}
