
// 2->4->1->3->5->null  
//  o/p ->  1 

/*public class ListNode {

    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) { this.val=val; }
    ListNode(int val,ListNode next) { this.val=val; this.next=next; }
}
*/

public class MiddleOfList {

    public ListNode Middle(ListNode head){
    ListNode fast=head ,slow=head;

    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    }



}
