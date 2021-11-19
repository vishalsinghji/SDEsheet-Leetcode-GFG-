//  1->2->3->4->5
//  1<-2<-3<-4<-5

//  Using 3 pointer prev,curr,next

/*public class ListNode {

    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) { this.val=val; }
    ListNode(int val,ListNode next) { this.val=val; this.next=next; }
}
*/

class Reverse{
    public ListNode reverseList(ListNode head){
        ListNode newHead=null;
        while(head!=null){
            ListNode next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }
}
