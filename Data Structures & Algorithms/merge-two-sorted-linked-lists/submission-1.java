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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
         ListNode ans=new ListNode();
        ArrayList<Integer> a=new ArrayList();
         if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        while(list1!=null){
            a.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            a.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(a);
        ListNode root=null;
        list1=null;
        list2=null;
        for(int num:a){
               ListNode temp=new ListNode(num);
               int pick=0;
               if(pick==0){
               if(root==null){
                root=temp;
                ans=temp;
               }
              

               else {
                root.next=temp;
                root=root.next;
               }
               pick=1;
            }
            
            else {
                if(pick==1){
               if(root==null){
                root=temp;
                ans=temp;
               }
               else {
                root.next=temp;
                root=root.next;
               }
               pick=0;

            }
          }
        }
        return ans;
    }
}
    
