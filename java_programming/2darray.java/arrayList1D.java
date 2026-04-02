import java.util.*;
public class arrayList1D {
  public static void main(String[] args) {
    ArrayList<Integer> list= new ArrayList<>();//create list 
    //add element in a list 
    list.add(3);
    list.add(4);
    list.add(6);
    System.out.println(list);
    // get element
    int variable =list.get(2);
    System.out.println(variable);
    //set element 
    list.set(1,55 );
    System.out.println(list);
    //insert at begining 
    list.add(0,69);
    System.out.println(list);
    //deletion in array list 
    //find size of array list 
    int var2=list.size();
    System.out.println(var2);
    list.remove(1);
    System.out.println(list);
    // loop in array list 
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ");
    }
    

  
    
  }
}
