package com.company;

public class Main {
    private Integer denominator, numerator;

    public static void main(String[] args) {
        Box Box1 = new Box();
        Box Box2 = new Box(5);
        Box Box3 = new Box(2, 3, 4);

        System.out.println(Box3.volume());
        System.out.println(Box3.area());

        Queue lst = new Queue();
        lst.push(2);
        lst.push(3);
        lst.push(4);
        System.out.println(lst.pop());
        System.out.println(lst.pop());
        System.out.println(lst.pop());
        lst.empty();

        Queue lst1 = new Queue(3);
        lst1.push(5);
        lst1.push(6);
        lst1.push(7);
        System.out.println(lst1.pop());
        lst1.push(7);
        lst1.full();



    }
}






