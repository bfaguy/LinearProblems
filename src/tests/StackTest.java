package tests;

import org.junit.Test;
import myStack.Stack;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class StackTest {

    @Test
    public void testPushPop() {
        Stack s = new Stack();
        String value = "foo";
        s.push(value);
        // Q: when pop, do we get the value stored at stack or node? 
        // guess: probably value;
        assertThat(s.pop(), is(value));
    }

    @Test
    public void testDoublePushPop() {
        Stack s = new Stack();
        s.push("foo");
        s.push("bar");
        // Q: when pop, do we get the value stored at stack or node? 
        // guess: probably value;
        assertThat(s.pop(), is("bar"));
    }
    
    @Test
    public void testPopEmptyStack() {
        Stack s = new Stack();
        assertThat(s.pop(), is(nullValue()));
    }
}
