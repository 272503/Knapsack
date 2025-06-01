package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Result {
    public final Map<Item, Integer> items = new LinkedHashMap<>();
    public int totalValue = 0;
    public int totalWeight = 0;

    public void addItem(Item item, int count) {
        items.put(item, count);
        totalValue += item.value * count;
        totalWeight += item.weight * count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Result:\n");
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            sb.append(entry.getKey()).append(", count = ").append(entry.getValue()).append("\n");
        }
        sb.append(String.format("Total value: %d\nTotal weight: %d", totalValue, totalWeight));
        return sb.toString();
    }
}
