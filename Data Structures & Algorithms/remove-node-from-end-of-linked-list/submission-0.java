/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
           ArrayList<Integer> a=new ArrayList<>();
           ListNode l=head;
           while(head!=null){
            a.add(head.val);
            head=head.next;
           }
           System.out.print(a);
           int count=a.size()+1;
           head=null;
           ListNode root=null;
           for(int i:a){
            ListNode temp=new ListNode(i);
            count--;
            if(count==n){
                continue;
            }
            if(root==null){
                root=temp;
                head=temp;
            }
            else {
                root.next=temp;
                root=root.next;
            }
        }
      return head;
    }
}
