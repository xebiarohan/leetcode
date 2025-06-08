package linkedlist;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        System.out.println(isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))))));
      //  System.out.println(isPalindrome(new ListNode(1, new ListNode(2, null))));
//        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
//        print(reverse(listNode));
    }

    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        int right = list.size()-1;
        int left = 0;
        while (left < right) {
            if(!list.get(left++).equals(list.get(right--))) {
                return false;
            }
        }
        return true;
    }

    public static ListNode reverse (ListNode head) {
        if(head == null ||  head.next == null) {
            return head;
        }
        ListNode before = null;
        ListNode current = head;
        ListNode after = null;

        while (current != null) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }
        return before;
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
