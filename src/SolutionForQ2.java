package src;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class SolutionForQ2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h = new ListNode(0);
        int sign = 0;
        int sum = 0;
        ListNode it1 = l1;
        ListNode it2 = l2;
        ListNode it3 = h;
        while(it1!=null && it2!=null){
            sum = it1.val+it2.val+sign;
            ListNode node = new ListNode((sum)%10);
            sign = (it1.val+it2.val+sign)/10;
            it3.next = node;
            it3 = it3.next;
            it1 = it1.next;
            it2 = it2.next;
        }
        if(it1!=null){
            while(it1!=null){
                sum = it1.val+sign;
                ListNode node = new ListNode((sum)%10);
                sign = (it1.val+sign)/10;
                it3.next = node;
                it3 = it3.next;
                it1 = it1.next;
            }
        }
        else{
            while(it2!=null){
                sum = it2.val+sign;
                ListNode node = new ListNode((sum)%10);
                sign = (it1.val+sign)/10;
                it3.next = node;
                it3 = it3.next;
                it2 = it2.next;
            }
        }
        if(sum==10){
            ListNode node = new ListNode(1);
            it3.val = 0;
            it3.next = node;
        }

        return h;
    }

    public static void main(String[] args) {
        ListNode h1 = new ListNode(2);
        ListNode l1 = h1;
        l1.next = new ListNode(4);
        l1 = l1.next;
        l1.next = new ListNode(3);
        ListNode h2 = new ListNode((5));
        l1 = h2;
        l1.next = new ListNode(6);
        l1 = l1.next;
        l1.next = new ListNode(4);
        ListNode ret = addTwoNumbers(h1,h2);
        int x = 0;

    }
}
