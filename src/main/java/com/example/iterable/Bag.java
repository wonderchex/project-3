package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T>{

    private List<T> Container;

    public Bag() {
        this.Container = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.Container.isEmpty();
    }

    @Override
    public int size() {
        return this.Container.size();
    }

    @Override
    public void add(T item) {
        this.Container.addLast(item);
    }

    @Override
    public Iterator<T> iterator() {
        return this.Container.iterator();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bag {");
        sb.append("Container=").append(Container);
        sb.append('}');
        return sb.toString();
    }
}
