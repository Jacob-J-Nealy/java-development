package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private int maxSize;
    private List<T> items;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void add(T items) {
        if (items.size() < maxSize) {
            items.add(items);
        } else {
            System.out.println("Nothing");
        }
    }
}
