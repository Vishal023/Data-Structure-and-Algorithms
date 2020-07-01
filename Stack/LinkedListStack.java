package SummerTrainingGFG.Stack;

/**
 * @author Vishal Singh
 */
public class LinkedListStack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static class List{
        Node head;
        void insertEnd(int data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
        int pop(){
            if(head == null){
                return -1;
            }
           int data = head.data;
           head = head.next;
           return data;
        }
        void print(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
    static class Stack {
        private final List list = new List();
        void push(int data){
            list.insertEnd(data);
        }
        int pop(){
            int temp = list.pop();
            return temp;
        }
        void print(){
            list.print();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(31);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(1);
        s.print();
    }
}
