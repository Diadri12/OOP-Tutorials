package InstanceOfOperator;

import InstanceOfOperator.Node;

public class NodeTest {
    static void printLabel(Node n) {
        if (n instanceof TreeNode)
            System.out.print("InstanceOfOperator.TreeNode-> ");
        else if (n instanceof Vertex)
            System.out.print("InstanceOfOperator.Vertex-> ");
        n.print();
    }

    public static void main(String[] args) {
        Node n1 = new TreeNode(100);
        Node n2 = new Vertex(500, 400);
        printLabel(n1);
        printLabel(n2);
    }
    }

