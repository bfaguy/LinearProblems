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
                currNode.setNext(new Node(item));
            }
            
            /* compare with this?
            while (currNode != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(new Node(item));
            */
        }
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

    public Node get(int index) {
        if (index == 1)
            return head;
        else {
            return getRecursive(head.getNext(), index-1);
        }
    }

    private Node getRecursive(Node node, int index) {
        if (index == 1) {
            return node;
        } else {
           return getRecursive(node.getNext(), index-1);
        }
    }
}
