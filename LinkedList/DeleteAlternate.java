package SummerTrainingGFG.LinkedList;

/**
 * @author Vishal Singh
 */
public class DeleteAlternate {
    static class Node {
        int data;
        Node next;
        public Node(int data){
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
    static void deleteAlternates(Node head){
        Node slow = head;
        while (slow != null && slow.next!= null){
            slow.next = slow.next.next;
            slow = slow.next;
        }
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertEndArrayOfData(new int[]{1,2,4,3,5,94,10});
        deleteAlternates(l.head);
        l.printList();
    }
}
