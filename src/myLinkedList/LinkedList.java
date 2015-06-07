package myLinkedList;

public class LinkedList {
    
    private Node head;

    // add could be easier with tail pointer
    // what are the costs / value of tail pointer 

    public void addLast(String item) {

        if (head == null) {
            addFirst(item);
        } else {
            Node currNode = head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.next = new Node(item);
        }
    }
    
    public int size() {
        // compare to storing it as a variable
        int size = 1;
        if (head == null) {
            return 0;
        } else {
            Node currNode = head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
                size++;
            }
        }
        return size;
    }

    protected void addFirst(String value) {
        Node newHead = new Node(value);
        if (head == null) {
            head = newHead;
        } else {
            newHead.setNext(head);
            head = newHead;
        }
    }
    
    protected String removeFirst() {
        String returnValue = null;
        if (head != null) {
            returnValue = head.getValue();
            head = head.getNext(); 
        }
        return returnValue;
    }

    // gets the ith node according to index
    public String get(int index) {
        String returnItem = null;

        if (index > 0) {
            Node currNode = head;
            for (int i = 1; i < index; i++) {
                currNode = currNode.getNext();
            }
            returnItem = currNode.getValue();
        }
        return returnItem;
    }

    private static class Node {

        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
            this.next = null;
        }

        public String getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node newNode) {
            this.next = newNode;
        }
    }
}
