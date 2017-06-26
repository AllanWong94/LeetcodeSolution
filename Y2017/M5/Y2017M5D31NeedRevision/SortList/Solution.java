package SortList;

/**
 * Created by Allan Wong on 2017/5/31.
 */
public class Solution {




    //Runtime:19ms Beats 3%
    //Used merge sort and O(1) space
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        head=mergeSort(head);
        return head;
    }

    //Use Bottom-up MergeSort
    //params[0]=>head,params[1]=>prev
    //prev is previous ListNode of the starting node of the two sorted arrays that needs to be merged. null means the start node is the head.
    //Other parameters will be calculated based on step and start.
    public ListNode[] merge(ListNode[] params, int step){
        ListNode prev=params[1];
        ListNode left;
        left=prev==null?params[0]:prev.next;
        ListNode mid=next(left,step-1,true);
        if(mid==null)
            return params;
        ListNode right=mid.next;
        ListNode end=next(mid,step,false);
        ListNode next=end.next;
        mid.next=null;
        end.next=null;
        ListNode pointer=new ListNode(0);
        ListNode sentinel=pointer;
        ListNode last=mid.val<=end.val?end:mid;     //This ListNode points to the last node of the
                                                    //sorted array, whose next is the start node of the next 2 arrays to be sorted.
        while(left!=null||right!=null){
            if(left==null){
                pointer.next=right;
                right=right.next;
                pointer=pointer.next;
            }else if(right==null){
                pointer.next=left;
                left=left.next;
                pointer=pointer.next;
            }else if(left.val>right.val){
                pointer.next=right;
                right=right.next;
                pointer=pointer.next;
            }else if(left.val<=right.val){
                pointer.next=left;
                left=left.next;
                pointer=pointer.next;
            }
        }
        last.next=next;
        if(prev==null){
            params[0]=sentinel.next;
        }else{
            prev.next=sentinel.next;
        }
        params[1]=last;
        return params;
    }


    //boolean indicates whether this ListNode is in the middle or the right
    //If it is the middle ListNode and it exceeds the list, it should return null indicating that this merge
    //sort should stop.
    //If it is the end ListNode and it exceeds the list, it should return the last ListNode of the list so
    //that the merge sort can finish.
    public ListNode next(ListNode node,int i,boolean mid){
        if(node==null)
            return null;
        for(int j=0;j<i;j++){
            if(node.next==null){
                if(mid){
                    return null;
                }else
                    return node;
            }
                node=node.next;
        }
        return node;
    }

    public ListNode mergeSort(ListNode head){
        int step=1;
        int length=size(head);
        ListNode last=null;
        ListNode[] params=new ListNode[]{head,last};
        ListNode[] temp;
        ListNode temp1,temp2;
        while(step<length) {
            while(true){
                temp1=params[0];temp2=params[1];
                params=merge(params,step);
                if(params[0].equals(temp1) && params[1].equals(temp2))
                    break;
            }
            step*=2;
            params[1]=null;
        }
        return params[0];
    }

    public int size(ListNode head){
        int size=1;
        while(head.next!=null){
            head=head.next;
            size++;
        }
        return size;
    }

    //Return true if L is M or L is in front of M
    public boolean inFrontOf(ListNode L, ListNode M){
        if(L==null)
            return false;
        while(true){
            if(L.equals(M))
                return true;
            if(L.next==null)
                break;
            L=L.next;
        }
        return false;
    }



    /*
    //Runtime:3ms
    //Quick enough, but not satisfying the requirement for O(1) extra space as QS always requires recursion, which
    //invokes O(logn) stack space.
    public ListNode sortList(ListNode head) {
        quickSort(head, null);
        return head;
    }
    private void quickSort(ListNode begin, ListNode end) {
        if (begin == end || begin.next == end) return;
        ListNode[] p = partition (begin, end);
        quickSort(begin, p[0]);
        quickSort(p[1],end);
    }
    private ListNode[] partition (ListNode begin,ListNode end) {
        int pivot = begin.val;
        ListNode eqHead = begin, eqTail = begin, p = begin.next;
        while (p != end) {
            if (p.val <= pivot) {
                if (p.val < pivot) {
                    int temp = eqHead.val;
                    eqHead.val = p.val;
                    p.val = temp;
                    eqHead = eqHead.next;
                }
                int temp = p.val;
                p.val = eqTail.next.val;
                eqTail.next.val = temp;
                eqTail = eqTail.next;
            }
            p = p.next;
        }
        return new ListNode[]{eqHead, eqTail.next};
    }
*/

    public ListNode head;

    public Solution(int[] nums){
        ListNode[] listNodes=new ListNode[nums.length];
        for(int i=0;i<listNodes.length;i++){
            listNodes[i]=new ListNode(nums[i]);
        }
        for(int j=0;j<listNodes.length-1;j++){
            listNodes[j].next=listNodes[j+1];
        }
        head=listNodes[0];
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    public static void main(String[] args) {
        Solution s=new Solution(new int[]{6,4,3,2,1});
        ListNode n=s.sortList(s.head);
        System.out.println(n.val);
        System.out.println("Done.");
    }
}