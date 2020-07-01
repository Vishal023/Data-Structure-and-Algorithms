package SummerTrainingGFG.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * @author Vishal Singh
 */
public class UnionIntersection {
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
    static void findIntersection(Node head1, Node head2)
    {
        LinkedList l3 = new LinkedList();
        HashSet<Integer> set = new HashSet<>();
        Node curr = head1;
        while (curr != null){
            set.add(curr.data);
            curr = curr.next;
        }
        Node curr2 = head2;
        while (curr2!=null){
            if (set.contains(curr2.data)){
                l3.insertEnd(curr2.data);
                set.remove(curr2.data);
            }
            curr2 = curr2.next;
        }
        l3.printList();
    }
    static void findUnion(Node head1,Node head2){
        HashSet<Integer> set = new HashSet<>();
        while (head1!=null){
            set.add(head1.data);
            head1 = head1.next;
        }
        while (head2!=null){
            set.add(head2.data);
            head2 = head2.next;
        }
        LinkedList l = new LinkedList();
        for (int x :
                set) {
            l.insertEnd(x);
        }
        l.printList();
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.insertEndArrayOfData(new int[]{9,6,4,2,3,8});
        l2.insertEndArrayOfData(new int[]{1,2,8,6});
        findIntersection(l1.head,l2.head);
        findUnion(l1.head, l2.head);
    }
}
