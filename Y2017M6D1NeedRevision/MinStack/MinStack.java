package MinStack;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Allan Wong on 2017/5/31.
 */
public class MinStack {
    //Runtime:118ms Beats 55%
    public Node sentinel;
    public int min;
    public int count;
    public class Node{
        public int val;
        public int min;
        public Node next;
        public Node(int v){
            val=v;
        }
    }


    /** initialize your data structure here. */
    public MinStack() {
        sentinel=new Node(Integer.MAX_VALUE);
        count=0;
        min=sentinel.val;
    }

    public void push(int x) {
        Node n=new Node(x);
        n.next=sentinel.next;
        sentinel.next=n;
        min=Math.min(n.val,min);
        n.min=min;
        count++;
    }

    public void pop() {
        if(count>0){
            sentinel.next=sentinel.next.next;
            min=sentinel.next==null?sentinel.val:sentinel.next.min;
            count--;
        }
    }

    public int top() {
        if(count==0)
            return -1;
        return sentinel.next.val;
    }

    public int getMin() {
        if(count==0)
            return 0;
        return sentinel.next.min;
    }






}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */