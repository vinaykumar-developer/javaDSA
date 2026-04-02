// class Node {// it creates node for a linked list 
//   int data ;
//   Node next;
//   Node(int val){// constructor 
//     this.data=val;
//   }
// }
public class tempCodeRunnerFile {
public static void main(String[] args) {
  Node a1 = new Node(10);
  Node a2 = new Node(69);
  a1.next=a2;
  a2.next=null;
  System.out.println(a1.data);
  System.out.println(a1.next);
  System.out.println(a2.data);
  System.out.println(a2.next);
}
}