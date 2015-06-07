package myStack;

import myLinkedList.LinkedList;

/**
 * stack is FILO. first in. last out. 
 * two ways to implement: the "top" of stack is head or tail
 * add to the head. pop from head. 
 *   1. adding to head is not expensive. 
 *   2. there is always a head pointer.
 * add to tail. pop from tail. more expensive because you have to find the tail and than pop.
 */
public class Stack extends LinkedList {
    // any advantage to extending linkedlist
    // why not encapsulate?

    public void push(String value) {
        this.addFirst(value);
    }

    public String pop() {
        return this.removeFirst();
    }
}
