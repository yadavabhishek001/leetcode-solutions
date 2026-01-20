class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode curr = head;
        while(curr != null){
            sz++;
            curr = curr.next;
        }
        if(sz == 0 && sz == 1){
            return null;
        }
        if(sz==n){
            head = head.next;
            return head;
        }
        ListNode temp = head;
        // int i = 0;
        for(int i = 1; i<sz-n ; i++){
            temp = temp.next;
        }
        // while(i < sz-n){
        //     temp = temp.next;
        //     i++;
        // }
        temp.next = temp.next.next;
        return head;
    }
}
