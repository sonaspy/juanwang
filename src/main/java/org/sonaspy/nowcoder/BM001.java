package org.sonaspy.nowcoder;


import org.sonaspy.other.ListNode;

public class BM001 {

    public ListNode ReverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        
        return pre;
    }
}
