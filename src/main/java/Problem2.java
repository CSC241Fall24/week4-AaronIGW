public class Problem2 {
    
    public static ListNode insert(ListNode head, int val, int position) {
    
        ListNode newNode = new ListNode(val);
        
        if (head == null || position <= 1) {
            newNode.next = head; 
            return newNode;
        }
        
        ListNode current = head;
        int currentIndex = 1;
    
        while (current.next != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }
        
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
    
    public static void main(String[] args) {
    
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        
        System.out.println("Original list: " + listToString(head));
        
        head = insert(head, 4, 2);
        System.out.println("After inserting 4 at position 2: " + listToString(head));
        
        head = insert(head, 5, 5);
        System.out.println("After inserting 5 at position 5: " + listToString(head));
        
        head = insert(head, 6, 1);
        System.out.println("After inserting 6 at position 1: " + listToString(head));
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

