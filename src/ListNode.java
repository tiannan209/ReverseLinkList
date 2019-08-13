/**
 * THis class is a simple implementation of linked list
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x){
        this.val = x;
    }

    public void printList(){
        String str = val + " ";
        while(this.next != null){
            str = str + "-> " + next.val;
        }
        str = str + "-> null";
        System.out.println(str);
    }

    public static void print(ListNode node){
        String str = node.val + " ";
        while(node.next != null){
            str = str + "-> " + node.next.val;
            node = node.next;
        }
        str = str + "-> null";
        System.out.println("Current pointer to node: " + node.val);
        System.out.println(str);
    }
}
