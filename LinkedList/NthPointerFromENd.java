package SummerTrainingGFG.LinkedList;

import java.awt.geom.Line2D;
import java.util.LinkedList;

/**
 * @author Vishal Singh
 */
class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
    }
}

class List2{
    Node2 head;
    void insertBegin(int data){
        Node2 temp = new Node2(data);
        temp.next = head;
        head = temp;
    }
    void printList(){
        Node2 curr = head;
        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("");
    }
    void insertEnd(int data){
        Node2 temp = new Node2(data);
        Node2 curr = head;
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

public class NthPointerFromENd {
    static void printNthNode(Node2 head,int n){
        if (head == null)
            return;
        Node2 first = head,second = head;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return;
            first = first.next;
        }
        while (first!=null){
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);
    }
    public static void main(String[] args) {
        List2 list = new List2();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);
        list.insertEnd(60);
        list.insertEnd(70);
        printNthNode(list.head,3);
    }
}
