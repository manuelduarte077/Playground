package Fase2;

import java.util.ArrayList;

public class MiQueue {
    private ArrayList<Integer> queue;

    public MiQueue() {
        queue = new ArrayList<>();
    }

    public void enqueue(int value) {
        queue.add(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return queue.remove(0);
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía");
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void printQueue() {
        System.out.println(queue);
    }
}

