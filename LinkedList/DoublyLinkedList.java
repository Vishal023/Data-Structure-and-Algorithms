package SummerTrainingGFG.LinkedList;

/**
 * @author Vishal Singh
 */
public class DoublyLinkedList {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            prev = next = null;
        }
    }
    static class LinkedList{
        Node head;
        void insertAtBeg(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            newNode.prev = null;
            if (head != null)
                head.prev = newNode;
            head = newNode;
        }
        void insertEnd(int data){
            Node newNode = new Node(data);
            Node curr = head;
            if (head == null){
                newNode.prev = null;
                head = newNode;
                return;
            }
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;
            newNode.next = null;
        }
        void insertAtPos(int pos,int data){
            if (pos<1){
                return;
            }
            if (pos == 1){
                insertAtBeg(data);
                return;
            }
            Node temp = new Node(data);
            Node curr = head;
            pos = pos -1;
            while (pos-->0){
                curr = curr.next;
            }
            Node after = curr.next;
            temp.next = after;
            after.prev = temp;
            curr.next = temp;
            temp.prev = curr;
        }
        void print(){
            Node curr = head;
            while (curr!=null){
                System.out.print(curr.data+" ");
                curr = curr.next;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtBeg(2);
        linkedList.insertAtBeg(1);
        linkedList.print();
        linkedList.insertEnd(3);
        linkedList.insertEnd(4);
        linkedList.print();
        linkedList.insertAtPos(1,0);
        linkedList.insertAtPos(2,22);
        linkedList.insertAtPos(4,44);
        linkedList.print();
    }
}
