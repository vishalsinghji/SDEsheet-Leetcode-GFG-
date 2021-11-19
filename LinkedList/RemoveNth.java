// 2->4->1->3->5->6->null  n=4  delete nth node from last 

/*public class ListNode {

    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) { this.val=val; }
    ListNode(int val,ListNode next) { this.val=val; this.next=next; }
}
*/


public class RemoveNth {
  
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode start=new ListNode();
        start.next=head;
        ListNode  slow=start;
        ListNode  fast=start;

        for(int i=0;i<=n;i++)
        fast=fast.next;

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
