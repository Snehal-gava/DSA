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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode t=head;
        while(t!=null){
            if(st.pop()==t.val){
                t=t.next;
            }else{
                return false;
            }
        }
        return true;
    }
}