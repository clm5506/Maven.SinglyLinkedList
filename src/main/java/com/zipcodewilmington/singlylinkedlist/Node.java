package com.zipcodewilmington.singlylinkedlist;


public class Node {

    private String data;
    private Node nextNode;

    public Node(String data) {
        this.data = data;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
