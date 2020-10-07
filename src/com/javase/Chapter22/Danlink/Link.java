package com.javase.Chapter22.Danlink;

public class Link {
    Node header = null;

    public void add(Object obj){
        if (header == null){
            header = new Node(obj,null);
        }else{
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(obj,null);
        }
    }

    private Node findLast(Node node) {
        if (node.next == null){
            return node;
        }
        return findLast(node.next);
    }

    public void remove(Object obj){

    }
    public void modify(Object obj){

    }
    public int find(Object obj){
        int i = 0;
        return i;
    }
}
