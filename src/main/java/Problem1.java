public class ListNode {
    public int val;
    public ListNode next;
    
    public ListNode(int x) { 
        val = x; 
    }
}

public class LinkedListProblems {

    // Function to concatenate two linked lists
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return copyList(l2);
        }

        ListNode current = l1;
        
        // Traverse to the end of the first list
        while (current.next != null) {
            current = current.next;
        }

        // Create a copy of l2 and link it to the end of l1
        ListNode l2Copy = copyList(l2);
        current.next = l2Copy;

        return l1;
    }

    // Helper function to create a copy of a linked list
    private static ListNode copyList(ListNode node) {
        if (node == null) {
            return null;
        }
        
        ListNode head = new ListNode(node.val);
        ListNode current = head;
        node = node.next;

        while (node != null) {
            current.next = new ListNode(node.val);
            current = current.next;
            node = node.next;
        }

        return head;
    }
}
