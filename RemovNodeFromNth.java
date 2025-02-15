//Time Complexity: O(n)
//Space Complexity: O(1)



public class RemovNodeFromNth {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //null case

        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast =dummy;
        int count=0;

        while(count <=n){
            fast = fast.next;
            count++;

        }

        ListNode slow = dummy;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;

    }

}
