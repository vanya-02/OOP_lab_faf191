package com.company;

public class Box {
    private Integer height;
    private Integer width;
    private Integer depth;

    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }
    public Box(Integer num) {
        this.height = num;
        this.width = num;
        this.depth = num;
    }
    public Box(Integer h, Integer w, Integer d) {
        this.height = h;
        this.width = w;
        this.depth = d;
    }

    public float area() {
        float area;
        return 2*(width+height+depth);
    }
    public float volume() {
        float volume;
        return width*height*depth;
    }

}
