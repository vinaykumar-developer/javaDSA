class Node{
  int val;
  Node next;
  Node (int val){
    this.val=val;
  }
}
public class l1 {
  public static void displayLinkedList(Node head){
    Node  temp =head;
    while (temp!=null) {
      System.out.println(temp.val);
      System.out.println(temp);
      temp=temp.next;
    }
    // System.out.println(head);
  }
  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(30);
    Node n4 = new Node(40);
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    displayLinkedList(n1);

  }
}
