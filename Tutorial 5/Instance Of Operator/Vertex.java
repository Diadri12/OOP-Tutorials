package InstanceOfOperator;

import InstanceOfOperator.Node;

public class Vertex implements Node {
    int x;
    int y;

    Vertex(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void print() {
        System.out.println("x: " + x + ", y: " + y);
}
}
