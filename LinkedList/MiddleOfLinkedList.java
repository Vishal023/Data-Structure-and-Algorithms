package SummerTrainingGFG.LinkedList;

import java.util.List;

/**
 * @author Vishal Singh
 */
class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
    }
}
class List1{
    Node1 head;
    /**
     * slow references = one node at time
     * fast references = two node at time*/
    void insertBegin(int data){
        Node1 temp = new Node1(data);
        temp.next = head;
        head = temp;
    }
    void searchMid(Node1 head){
        if (head == null)
            return;
        Node1 slow = head, fast = head;
        while (fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

}
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        List1 l = new List1();
        l.insertBegin(4);
        l.insertBegin(40);
        l.insertBegin(400);
        l.insertBegin(500);
        l.insertBegin(50);
        l.insertBegin(5);

        l.searchMid(l.head);
    }
}
