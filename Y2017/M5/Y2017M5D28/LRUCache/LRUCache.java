package LRUCache;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/5/28.
 */
public class LRUCache {


    //Before improvements: Runtime:182ms Beats 30%
    //Improvements:use an int to store the size instead of using hm.size();
    //After improvements: Runtime:138ms Beats 95%
    public class Node{
        public int key;
        public int val;
        public Node prev,next;
        public Node(int k,int v){
            key=k;
            val=v;
            prev=null;
            next=null;
        }
    }

    public int cap,length;//improvement:length
    public Node head,tail;
    public HashMap<Integer,Node> hm;



    public LRUCache(int capacity) {
        hm=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.prev=null;
        head.next=tail;
        tail.prev=head;
        tail.next=null;
        cap=capacity;
        length=0;
    }

    public void deleteNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void add(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }

    public int get(int key) {
        Node n=hm.get(key);
        if(n==null)
            return -1;
        int res=n.val;
        deleteNode(n);
        add(n);
        return res;
    }

    public void put(int key, int value) {
        Node n;
        if(get(key)!=-1){   //improvement:utilize get(int key) to move the node to the front
                            //and return a result indicating whether the key exists.
            n=hm.get(key);
            n.val=value;
        }else{
            if(length>=cap){
                hm.remove(tail.prev.key);
                deleteNode(tail.prev);
            }else
                length++;
            n=new Node(key,value);
            add(n);
        }
        hm.put(key,n);
    }







/*   Runtime 122ms



    class DoubleLinkedListNode {
        public int key;
        public int value;

        public DoubleLinkedListNode pre;
        public DoubleLinkedListNode next;

        DoubleLinkedListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<Integer, DoubleLinkedListNode> hmap = new HashMap<>();
    private DoubleLinkedListNode head;
    private DoubleLinkedListNode tail;
    private int capacity;
    private int len;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        len = 0;
    }

    public int get(int key) {
        if( hmap.containsKey(key) ) {
            DoubleLinkedListNode node = hmap.get(key);
            removeNode(node);
            setHead(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if( hmap.containsKey(key) ) {
            DoubleLinkedListNode oldnode = hmap.get(key);
            oldnode.value = value;
            removeNode(oldnode);
            setHead(oldnode);
        } else {
            DoubleLinkedListNode newnode = new DoubleLinkedListNode(key, value);
            if( len < capacity ) {
                len++;
            } else {
                hmap.remove(tail.key);
                tail = tail.pre;
                if (tail != null) {
                    tail.next = null;
                }
            }
            setHead(newnode);
            hmap.put(key, newnode);
        }
    }

    private void setHead(DoubleLinkedListNode node) {
        node.next = head;
        node.pre = null;
        if( head != null ) {
            head.pre = node;
        }
        head = node;
        if( tail == null ) {
            tail = node;
        }
    }

    private void removeNode(DoubleLinkedListNode node) {
        DoubleLinkedListNode pre = node.pre;
        DoubleLinkedListNode next = node.next;
        if ( pre != null ) {
            pre.next = next;
        } else {
            head = next;
        }
        if( next != null ) {
            next.pre = pre;
        } else {
            tail = pre;
        }
    }*/
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */