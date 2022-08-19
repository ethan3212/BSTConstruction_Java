package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindClosestValueIterativeTest {
    @Test
    public void findClosestToOne() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(1, testTree.findClosestValueInBSTIterative(1));
    }

    @Test
    public void findClosestToTwo() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(2, testTree.findClosestValueInBSTIterative(2));
    }

    @Test
    public void findClosestToThree() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(3, testTree.findClosestValueInBSTIterative(3));
    }

    @Test
    public void findClosestToFour() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(4, testTree.findClosestValueInBSTIterative(4));
    }

    @Test
    public void findClosestToFive() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(5, testTree.findClosestValueInBSTIterative(5));
    }

    @Test
    public void findClosestToSix() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(6, testTree.findClosestValueInBSTIterative(6));
    }

    @Test
    public void findClosestToSeven() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(7, testTree.findClosestValueInBSTIterative(7));
    }

    @Test
    public void findClosestToEight() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(8, testTree.findClosestValueInBSTIterative(8));
    }

    @Test
    public void findClosestToNine() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(9, testTree.findClosestValueInBSTIterative(9));
    }

    @Test
    public void findClosestToTen() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(10, testTree.findClosestValueInBSTIterative(10));
    }

    @Test
    public void findClosestToEleven() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(10, testTree.findClosestValueInBSTIterative(11));
    }

    @Test
    public void findClosestToNegativeOne() {
        BST testTree = new BST(5);
        testTree.insertNode(3);
        testTree.insertNode(1);
        testTree.insertNode(2);
        testTree.insertNode(4);
        testTree.insertNode(7);
        testTree.insertNode(9);
        testTree.insertNode(6);
        testTree.insertNode(8);
        testTree.insertNode(10);
        assertEquals(1, testTree.findClosestValueInBSTIterative(-1));
    }
}