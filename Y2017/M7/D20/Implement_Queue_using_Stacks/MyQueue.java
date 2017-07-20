package Y2017.M7.D20.Implement_Queue_using_Stacks;

import java.util.Stack;

/**
 * Created by Allan Wong on 7/20/2017.
 */
//Runtime:100ms Better than or equals to 63%
public class MyQueue {
    Stack stack1, stack2;//Stack1 is for push. Stack2 is for pop.


    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
        stack1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        return (int) stack2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        return (int) stack2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack2.isEmpty()&&stack1.isEmpty();
    }

    //Runtime:87ms
    /*No need to get everything in stack 2 for popping! Wait until stack2 is emptied then push everything in
      stack1 into stack2!
    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    */

}
