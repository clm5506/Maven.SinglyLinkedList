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

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetFindHead(){

        //Given
        String testData = "hi";
        SinglyLinkedList list = new SinglyLinkedList(testData);
        int expected = 0;

        //When
        int actual = list.find(testData);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSizeAfterRemoveNode(){

        //Given
        String headNodeData = "hi";
        String secondNodeData = "bye";
        String thirdNodeData = "moop";
        SinglyLinkedList list = new SinglyLinkedList(headNodeData);
        list.add(secondNodeData);
        list.add(thirdNodeData);
        int beforeSize = 3;
        int actualBefore = list.getSize();
        Assert.assertEquals(beforeSize,actualBefore);

        int expected = 2;

        //When
        list.removeNode(2);
        int actual = list.getSize();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindAfterRemoveNode(){

        //Given
        String headNodeData = "hi";
        String secondNodeData = "bye";
        String thirdNodeData = "moop";
        SinglyLinkedList list = new SinglyLinkedList(headNodeData);
        list.add(secondNodeData);
        list.add(thirdNodeData);
        int beforeSize = 3;
        int actualBefore = list.getSize();
        Assert.assertEquals(beforeSize,actualBefore);

        int expected = -1;

        //When
        list.removeNode(1);
        int actual = list.find(secondNodeData);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testContainsNegative(){

        //Given
        String headNodeData = "hi";
        String secondNodeData = "bye";
        String thirdNodeData = "moop";
        SinglyLinkedList list = new SinglyLinkedList(headNodeData);
        list.add(secondNodeData);
        list.add(thirdNodeData);

        int beforeSize = 3;
        int actualBefore = list.getSize();
        Assert.assertEquals(beforeSize,actualBefore);

        boolean expected = false;

        //When
        list.removeNode(1);
        boolean actual = list.contains(secondNodeData);

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testContainsPositive(){

        //Given
        String headNodeData = "hi";
        String secondNodeData = "bye";
        String thirdNodeData = "moop";
        SinglyLinkedList list = new SinglyLinkedList(headNodeData);
        list.add(secondNodeData);
        list.add(thirdNodeData);

        int beforeSize = 3;
        int actualBefore = list.getSize();
        Assert.assertEquals(beforeSize,actualBefore);

        boolean expected = true;

        //When
        boolean actual = list.contains(secondNodeData);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCopyLinkedList(){

        //Given
        String headNodeData = "hi";
        String secondNodeData = "bye";
        String thirdNodeData = "moop";
        SinglyLinkedList originalLinkedList = new SinglyLinkedList(headNodeData);
        originalLinkedList.add(secondNodeData);
        originalLinkedList.add(thirdNodeData);
        int sizeOfOriginalList = originalLinkedList.getSize();
        int counter = 0;

        //When
        SinglyLinkedList copy = originalLinkedList.copy();

        //Then
        while(counter < sizeOfOriginalList) {
            Assert.assertEquals(originalLinkedList.getNode(counter).getData(), copy.getNode(counter).getData());
            counter++;
        }
    }
}
