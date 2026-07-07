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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        left--;
        right--;
        while(left<right){
            int temp=a.get(left);
            a.set(left,a.get(right));
            a.set(right,temp);
            left++;
            right--;
        }
        ListNode root=null;
        head=null;
        for(int n:a){
            ListNode tem=new ListNode(n);
            if(root==null){
                root=tem;
                head=tem;
            
            }
            else{
                root.next=tem;
                root=root.next;
            }
        }
        return head;
    }
}