package org.example;

public class BST {
    public int value;
    public BST leftChild;
    public BST rightChild;

    public BST(int value) {
        this.value = value;
    }

    // AVERAGE: O(log(n)) time | O(log(n)) space
    // WORST: O(n) time | O(n) space
    public void insertNode(int valueToInsert) {
        BST currentNode = this;
        while (true) {
            if(valueToInsert < currentNode.value) {
                if(currentNode.leftChild == null) {
                    currentNode.leftChild = new BST(valueToInsert);
                    break;
                } else {
                    currentNode = currentNode.leftChild;
                }
            } else {
                if(currentNode.rightChild == null) {
                    currentNode.rightChild = new BST(valueToInsert);
                    break;
                } else {
                    currentNode = currentNode.rightChild;
                }
            }
        }
    }

    // AVERAGE: O(log(n)) time | O(log(n)) space
    // WORST: O(n) time | O(n) space
    public Boolean containsNode(int valueToFind) {
        BST currentNode = this;
        while(currentNode != null) {
            if(valueToFind < currentNode.value) {
                currentNode = currentNode.leftChild;
            } else if(valueToFind > currentNode.value) {
                currentNode = currentNode.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }

    // AVERAGE: O(log(n)) time | O(log(n)) space
    // WORST: O(n) time | O(n) space
    public void removeNode(int valueToRemove) {
        removeNode(valueToRemove, null);
    }

    // AVERAGE: O(log(n)) time | O(log(n)) space
    // WORST: O(n) time | O(n) space
    public void removeNode(int valueToRemove, BST parentNode) {
        BST currentNode = this;
        while(currentNode != null) {
            if(valueToRemove < currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.leftChild;
            } else if(valueToRemove > currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.rightChild;
            } else  {
                if(currentNode.leftChild != null && currentNode.rightChild != null) {
                    currentNode.value = currentNode.rightChild.getSmallestValueInRightSubtree();
                    currentNode.rightChild.removeNode(currentNode.value, currentNode);
                } else if(parentNode == null) {
                    if(currentNode.leftChild != null) {
                        currentNode.value = currentNode.leftChild.value;
                        currentNode.rightChild = currentNode.leftChild.rightChild;
                        currentNode.leftChild = currentNode.leftChild.leftChild;
                    } else if(currentNode.rightChild != null) {
                        currentNode.value = currentNode.rightChild.value;
                        currentNode.leftChild = currentNode.rightChild.leftChild;
                        currentNode.rightChild = currentNode.rightChild.rightChild;
                    }
                } else if(parentNode.leftChild == currentNode) {
                    parentNode.leftChild = (currentNode.leftChild != null) ? currentNode.leftChild : currentNode.rightChild;
                } else if(parentNode.rightChild == currentNode){
                    parentNode.rightChild = (currentNode.leftChild != null) ? currentNode.leftChild : currentNode.rightChild;
                }
                break;
            }
        }
    }

    // AVERAGE: O(log(n)) time | O(log(n)) space
    // WORST: O(n) time | O(n) space
    public int getSmallestValueInRightSubtree(){
        if(leftChild == null) {
            return value;
        } else {
            return leftChild.getSmallestValueInRightSubtree();
        }
    }

    public void displayTree() {
        if(leftChild != null) {
            leftChild.displayTree();
        }
        System.out.print(value + " ");
        if(rightChild != null) {
            rightChild.displayTree();
        }
    }

    // WORST: O(n) time | O(1) space
    // AVERAGE: O(log(n)) time | O(1) space
    public  int findClosestValueInBSTIterative(int targetValue) {
        int closestValueFound = value;
        BST currentNode = this;
        while(currentNode != null) {        // O(n) time
            if(Math.abs(targetValue - currentNode.value) < Math.abs(targetValue - closestValueFound)) {
                closestValueFound = currentNode.value;
            } if(currentNode.value < targetValue) {
                currentNode = currentNode.rightChild;
            } else if(currentNode.value > targetValue) {
                currentNode = currentNode.leftChild;
            } else {
                break;
            }
        }
        return closestValueFound;
    }

    // WORST: O(n) time | O(n) space
    // AVERAGE: O(log(n)) time | O(log(n)) space
    public int findClosestValueInBSTRecursive(int targetValue) {
        return helperMethod(this, targetValue, value);
    }

    // WORST: O(n) time | O(n) space
    // AVERAGE: O(log(n)) time | O(log(n)) space
    public static int helperMethod(BST currentNode, int targetValue, int closestValueFound) {
        if(Math.abs(targetValue - closestValueFound) > Math.abs(targetValue - currentNode.value)) {
            closestValueFound = currentNode.value;
        }
        if(targetValue < currentNode.value && currentNode.leftChild != null) {
            return helperMethod(currentNode.leftChild, targetValue, closestValueFound);
        } else if(targetValue > currentNode.value && currentNode.rightChild != null) {
            return helperMethod(currentNode.rightChild, targetValue, closestValueFound);
        } else {
            return closestValueFound;
        }
    }
}
