package InstanceOfOperator;

import InstanceOfOperator.Node;

public class TreeNode implements Node {
    int data;

    TreeNode(int data){
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println("Data:" + data);
    }
}
