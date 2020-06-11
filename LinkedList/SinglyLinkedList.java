package SummerTrainingGFG.LinkedList;

/**
 * @author Vishal Singh
 */

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class List{
    Node head;
    void insertBegin(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    void printList(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("");
    }
    void insertEnd(int data){
        Node temp = new Node(data);
        Node curr = head;
        if (head == null){
            head = temp;
            return;
        }
        while (curr.next != null){
            curr=curr.next;
        }
        curr.next = temp;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        List list = new List();
        list.insertBegin(5);
        list.insertBegin(15);
        list.insertBegin(3);

        list.printList();

        list.insertEnd(100);
        list.insertEnd(105);
        list.insertEnd(1);

        list.printList();

    }
}
