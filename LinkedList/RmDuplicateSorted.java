package SummerTrainingGFG.LinkedList;

/**
 * @author Vishal Singh
 */
public class RmDuplicateSorted {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next =  null;
        }
    }
    static class List{
        Node head;
        Node tail;
        void addToTheLast(Node node){
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
        }
        void print(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data+",");
                curr = curr.next;
            }
            System.out.println("");
        }
        void removeDuplicates() {
            Node curr = head;
            while (curr != null && curr.next != null) {
                if (curr.data == curr.next.data) {
                    curr.next = curr.next.next;
                } else
                    curr = curr.next;
            }
        }
    }
    public static void main(String[] args) {
        List l = new List();
        l.addToTheLast(new Node(2));
        l.addToTheLast(new Node(3));
        l.addToTheLast(new Node(3));
        l.addToTheLast(new Node(4));
        l.addToTheLast(new Node(55));
        l.addToTheLast(new Node(556));
        l.addToTheLast(new Node(556));
        l.print();
        l.removeDuplicates();
        l.print();
    }
}
