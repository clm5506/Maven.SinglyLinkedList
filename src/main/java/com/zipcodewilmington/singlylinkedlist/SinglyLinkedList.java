package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    private Node head;
    private int size;


    public SinglyLinkedList(String data) {
        this.head = new Node(data);
        this.size = 1;
    }

    public void add(String data){
        boolean hasNext = true;
        Node temp = head;

        while(hasNext){
            if(temp.getNextNode() == null){
              temp.setNextNode(new Node(data));
              size += 1;
              hasNext = false;

            } else {
                temp = temp.getNextNode();
            }
        }
    }

    public int getSize() {
    return size;
    }

    public Node getNode(int index){
        int counter = 0;
        Node temp = head;
        while(counter < index){
         temp = temp.getNextNode();
         counter++;
        }
        return temp;
    }

    public int find(String data){
        int counter = 0;
        Node temp = head;

        while(counter < this.size){
            if(temp.getData().equals(data)) {
                return counter;
            } else {
                temp = temp.getNextNode();
                counter++;
             //   temp = temp.getNextNode();
            }
        }
        return -1;
    }
}
