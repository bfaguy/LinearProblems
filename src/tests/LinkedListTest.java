package tests;

import org.junit.Test;
import myLinkedList.LinkedList;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testAdd() {
        LinkedList ll = new LinkedList();
        ll.addLast("one");
        assertThat(ll.get(1).getValue(), is("one"));
    }
    
    @Test
    public void testAddTwoNodes() {
        LinkedList ll = new LinkedList();
        ll.addLast("one");
        ll.addLast("two");
        assertThat(ll.get(2).getValue(), is("two"));
    }
}
