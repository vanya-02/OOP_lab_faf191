package com.company;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> lst;
    private int[] lst_fixed;
    private int last_i = 0;

    public Queue(int size) {
        this.lst_fixed = new int[size];
    }

    public Queue() {
        this.lst = new ArrayList<>();
    }

    public void push(int i) {
        if (lst_fixed != null) {
            if (lst_fixed.length > last_i) {
                lst_fixed[last_i] = i;
                last_i += 1;
            } else {
                System.out.println("Queue is full. Pushing is not possible.");
            }
        } else {
            lst.add(i);
            last_i += 1;
        }
    }

    public int pop() {
        int temp = 0;

        if (last_i == 0) {
            System.out.println("Queue is empty. Poping is not possible.");
        }
        if (lst_fixed != null && last_i != 0) {
            temp = lst_fixed[0];
            last_i -= 1;
            for (int i = 0; i < lst_fixed.length-1; i++) {
                lst_fixed[i] = lst_fixed[i + 1];
            }
        }
        if (lst != null && last_i != 0) {
            temp = lst.get(0);
            last_i -= 1;
            for (int i = 0; i < lst.size()-1; i++) {
                lst.set(i, lst.get(i + 1));
            }
        }
        return temp;
    }

    public void empty() {
        if (lst_fixed != null) {
            if (0 == last_i) {
                System.out.println("Queue is Empty");
            }
        else {
            if (last_i == 0) {
                System.out.println("Queue is Empty");
            }
            }
        }
    }

    public void full() {
        if (lst_fixed != null) {
            if (lst_fixed.length == last_i) {
                System.out.println("Queue is Full");
            }
        }
    }

}
