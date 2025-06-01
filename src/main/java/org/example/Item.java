package org.example;

public class Item {
    public final int weight;
    public final int value;
    public final int index;

    public Item(int index, int weight, int value) {
        this.index = index;
        this.weight = weight;
        this.value = value;
    }

    public double ratio() {
        return (double) value / weight;
    }

    @Override
    public String toString() {
        return String.format("Item %d [weight=%d, value=%d, ratio=%.2f]", index, weight, value, ratio());
    }
}

