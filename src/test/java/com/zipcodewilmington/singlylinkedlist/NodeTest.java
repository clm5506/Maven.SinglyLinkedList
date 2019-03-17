package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

    @Test
    public void testNode(){
        //Given
        String testData = "hiya";

        //When
        Node node = new Node(testData);

        //Then
        Assert.assertEquals(testData,node.getData());

    }

    @Test
    public void testNodeDataSetter(){
        //Given
        String testData = "hiya";
        String newData = "COMO ESTAS";
        Node node = new Node(testData);

        //When
        node.setData(newData);

        //Then
        Assert.assertEquals(newData,node.getData());

    }

    @Test
    public void testNodeDataSetter2(){
        //Given
        String testData = "hiya";
        String newData = "COMO ESTAS";
        Node node = new Node(testData);
        Node newNode = new Node(newData);

        //When
        node.setNextNode(newNode);

        //Then
        Assert.assertEquals(newNode,node.getNextNode());

    }
}
