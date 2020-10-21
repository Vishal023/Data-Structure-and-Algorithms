package SummerTrainingGFG.LinkedList;

/**
 * @author Vishal Singh
 */
public class SplitAlternatingly {
    static class Node {
    int data;
        Node next;
            Node(int data){
            this.data = data;
        }
    }
    static class LinkedList{
        Node head;
        Node tail;
        void insertEnd(int data){
            Node temp = new Node(data);
            Node curr = head;
            if (head == null){
                head = temp;
                tail = temp;
                return;
            }
            while (curr.next != null){
                curr=curr.next;
            }
            tail = temp;
            curr.next = temp;
        }
        void insertEndArrayOfData(int[] data){
            for (int i = 0; i < data.length; i++) {
                insertEnd(data[i]);
            }
        }
        void printList(){
            if (head == null)
                return;
            Node curr = head;
            while (curr != null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
            System.out.println();
        }
    }
    public static Node a;
    public static Node b;
    static void splitAlternative(Node head){
        LinkedList a = new LinkedList();
        a.head = head;
        LinkedList b = new LinkedList();

        Node curr = head;
        while (curr != null && curr.next!= null){
            b.insertEnd(curr.next.data);
            curr.next = curr.next.next;
            curr = curr.next;
        }
        a.printList();
        b.printList();
    }
    public static void main(String[] args) {
        LinkedList l  = new LinkedList();
        l.insertEndArrayOfData(new int[]{1,2,3,4,5,6,7});
        splitAlternative(l.head);
    }
}
