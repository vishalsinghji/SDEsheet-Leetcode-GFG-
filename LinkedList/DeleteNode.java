//  1->2->3->4->5  Node=3
//  1->2->4->5



public class DeleteNode {
    public ListNode deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
    
}
