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
            }
        }
        return -1;
    }

    public void removeNode(int index) {

        if (index == 0) {
            head = head.getNextNode();
        } else {
            getNode(index - 1).setNextNode(getNode(index + 1));
        }

        size -= 1;
    }

    public boolean contains(String data) {
        if (find(data) == -1) {
            return false;
        } else return true;
    }


    public SinglyLinkedList copy() {
        SinglyLinkedList copyOfOriginalList = new SinglyLinkedList(this.head.getData());
        int counter = 1;

        while (counter < this.size) {
            copyOfOriginalList.add(this.getNode(counter).getData());
            counter++;
        }
        return copyOfOriginalList;
    }


    public SinglyLinkedList sort() {
        Node prev = head;
        Node temp = prev.getNextNode();
        Node next = temp.getNextNode();
        int counter = 0;
        while (counter < getSize()) {
            if (counter == 0) {
                head = temp;
                temp.setNextNode(prev);
                prev.setNextNode(next);
                counter++;
            } else {
                if (prev.getData().compareTo(temp.getData()) > 0) {
                    temp.setNextNode(prev);
                    prev.setNextNode(next);
                    counter++;
                }
                counter++;
            }
        }
        return this;
    }


    public void putInRightPlace(Node element) {

    }

    public static void main(String[] args) {
        String headNodeData = "zebra";
        String secondNodeData = "bye";
        String thirdNodeData = "abc";
        SinglyLinkedList list = new SinglyLinkedList(headNodeData);
        list.add(secondNodeData);
        list.add(thirdNodeData);

        list.sort();

        System.out.println(list.getNode(0).getData());
        System.out.println(list.getNode(1).getData());
        System.out.println(list.getNode(2).getData());
    }
}
