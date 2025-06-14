package linkedlist;

public class DeleteLastNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        int length = 1;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            length = length + 2;
        }

        if (fast == null) {
            length = length - 1;
        }

        int indexToRemove = length - n + 1;

        if (indexToRemove == 1) {
            return head.next;
        } else {
            ListNode temp = head;
            int index = 1;
            while (index != indexToRemove -1) {
                temp = temp.next;
                index++;
            }
            temp.next = temp.next.next;
        }
        return head;

    }
}
