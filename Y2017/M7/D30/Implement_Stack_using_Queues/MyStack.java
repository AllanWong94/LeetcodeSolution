package Y2017.M7.D30.Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Allan Wong on 7/30/2017.
 */
public class MyStack {

    //Runtime:98ms Fastest
    //Reference: https://discuss.leetcode.com/topic/36189/java-solutions-about-three-ways-one-of-which-utilizes-one-queue-and-the-others-utilize-two-queues/2
    //Runtime:
    /*
    */


    Queue<Integer> q;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        q = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        q.add(x);
        for (int i = 1; i < q.size(); i++) {
            q.add(q.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return q.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return q.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */