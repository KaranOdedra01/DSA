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
        if(head == null)
        return head;

        ListNode tmp = head;

        ArrayList<Integer> lst = new ArrayList<>();
        while(tmp!=null){
            lst.add(tmp.val);
            tmp = tmp.next;
        }
        int l = left - 1;
        int r = right - 1;

        while(l < r){
            int f = lst.get(l);
            int s = lst.get(r);
            lst.set(l,s);
            lst.set(r,f);
            l++;
            r--;
        }
    tmp = head;
    for(int i = 0;i<lst.size();i++){
        tmp.val = lst.get(i);
        tmp = tmp.next;
    }
    return head;




    }
}