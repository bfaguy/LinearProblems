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
        assertThat(ll.get(1), is("one"));
    }
    
    @Test
    public void testAddTwoNodes() {
        LinkedList ll = new LinkedList();
        ll.addLast("one");
        ll.addLast("two");
        ll.addLast("three");
        assertThat(ll.get(2), is("two"));
        assertThat(ll.get(3), is("three"));
    }
    
    @Test
    public void testSize() {
        LinkedList ll = new LinkedList();
        ll.addLast("one");
        ll.addLast("two");
        ll.addLast("three");
        assertThat(ll.size(), is(3));
    }

    @Test
    public void testGetFromEmpty() {
        LinkedList ll = new LinkedList();
        assertThat(ll.get(1), is(nullValue()));
    }
    
}
