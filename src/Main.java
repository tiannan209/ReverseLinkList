public class Main {

    public static void main(String[] args) {

        System.out.println("Creating a linked list");
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        //ln.printList();
        ListNode.print(ln);
        System.out.println(ln.val);
    }

    public static ListNode reverseList(ListNode head){
        ListNode ln = null;
        return ln;
    }
}
