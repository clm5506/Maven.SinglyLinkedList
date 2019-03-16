package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testConstructor(){

        //Given
        String testData = "hi";

        //When
        SinglyLinkedList list = new SinglyLinkedList(testData);

        //Then
        Assert.assertTrue(list.getSize() == 1);
    }

    @Test
    public void testAdd(){

        //Given
        String testData = "hi";
        SinglyLinkedList list = new SinglyLinkedList(testData);
        Assert.assertTrue(list.getSize() == 1);
        String secondNodeData = "bye";

        //When
        list.add(secondNodeData);

        //Then
        Assert.assertTrue(list.getSize() == 2);
    }
    @Test
    public void testAdd2(){

        //Given
        String testData = "hi";
        SinglyLinkedList list = new SinglyLinkedList(testData);
        Assert.assertTrue(list.getSize() == 1);
        String secondNodeData = "bye";
        String thirdNodeData = "hasta luego";

        //When
        list.add(secondNodeData);
        list.add(thirdNodeData);

        //Then
        Assert.assertTrue(list.getSize() == 3);
    }

    @Test
    public void testGetNode(){

        //Given
        String testData = "hi";
        String secondNodeData = "bye";
        SinglyLinkedList list = new SinglyLinkedList(testData);
        list.add(secondNodeData);

        //When
        String actual = list.getNode( 1).getData();

        //Then
        Assert.assertEquals(secondNodeData,actual);
    }

    @Test
    public void testGetFindNegativeOne(){

        //Given
        String testData = "hi";
        String secondNodeData = "bye";
        SinglyLinkedList list = new SinglyLinkedList(testData);
        int expected = -1;

        //When
        int actual = list.find(secondNodeData);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetFindIndex(){

        //Given
        String testData = "hi";
        String secondNodeData = "bye";
        String thirdNodeData = "moop";
        SinglyLinkedList list = new SinglyLinkedList(testData);
        list.add(secondNodeData);
        list.add(thirdNodeData);
        int expected = 2;

        //When
        int actual = list.find(thirdNodeData);

        Assert.assertEquals(expected,actual);
    }

}
