public class Problem1 {

    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return copyList(l2);
        }

        ListNode current = l1;

        while (current.next != null) {
            current = current.next;
        }

        ListNode l2Copy = copyList(l2);
        current.next = l2Copy;

        return l1;
    }

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

    
    public static void main(String[] args) {
    
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(1);

    
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(5);

        System.out.println("Original List l1: " + listToString(l1));
        System.out.println("Original List l2: " + listToString(l2));

    
        ListNode concatenatedList = concatenate(l1, l2);
        System.out.println("Concatenated List: " + listToString(concatenatedList));
    }

    public static String listToString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val);
            if (node.next != null) {
                sb.append(" -> ");
            }
            node = node.next;
        }
        return sb.toString();
    }
}

