package com.company;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(11, "A");
        tree.add(10, "B");
        tree.add(5, "V");
        tree.add(8, "C");
        tree.add(8, "C");
        System.out.println(tree.getObject(5));

//        tree.delete(8);
    }
}
