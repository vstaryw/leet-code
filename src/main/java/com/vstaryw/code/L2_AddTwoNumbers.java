package com.vstaryw.code;

/**
 * 两数之和
 */
public class L2_AddTwoNumbers {


    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        int carried = 0;
        while (p1 != null || p2 != null){
            int a = p1 != null ? p1.val : 0;
            int b = p2 != null ? p2.val : 0;
            cur.next = new ListNode((a + b + carried) % 10);
            carried = (a + b + carried) / 10;
            cur = cur.next;
            p1 = p1 != null ? p1.next : null;
            p2 = p2 != null ? p2.next : null;
        }
        cur.next = carried > 0 ? new ListNode(1): null;
        return dummyHead.next;
    }


}
class ListNode {

    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}