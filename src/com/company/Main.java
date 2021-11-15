package com.company;

public class Main {

    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.add(11,"A");
        tree.add(10,"B");
        tree.add(5,"V");
        tree.add(8,"C");
        tree.add(3,"D");
        tree.add(6,"E");
        tree.add(9,"E");
        tree.print(8);
        tree.delete(8);
    }
}
