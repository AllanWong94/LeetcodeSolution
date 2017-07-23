package Y2017.M7.D23.Linked_List_Cycle_II;

import Y2017.ListNode;

/**
 * Created by Allan Wong on 7/23/2017.
 */
public class Solution {
    //Runtime:1ms Better than or equals to 100%  One-time AC!
    //Requirement: No modification of the list, no extra space.
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        ListNode walker=head,runner=head;
        do{
            if(runner.next==null || runner.next.next==null) return null;
            walker=walker.next;
            runner=runner.next.next;
        } while(walker!=runner);
        walker=head;
        while(walker!=runner){
            walker=walker.next;
            runner=runner.next;
        }
        return runner;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }



}
