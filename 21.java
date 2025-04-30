class Solution{
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode x = new ListNode();
        // int i = 0;
        // int j = 0;
        while(list1.next != null && list2.next != null){
            if(list1.val < list2.val){
                
            }
            if (e1 < e2 && e1 != 0){
                x.val = e1;
            }
            else{
                x.val = e2;
            }
            x = x.next;
        }
        return x;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode();

    }
}
        
 