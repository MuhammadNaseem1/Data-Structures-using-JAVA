import  java.util.*;
import java.io.*;

class task4
{
    class node
    {
        int data;
        node next;
    }
   node head=null;
    void insert(int data)
    {
        node n=new node();
        n.data=data;
        n.next=null;
       if(head==null)
       {
           head=n;
       }
       else{
           node curr=head;
           while(curr.next!=null)
           {
               curr=curr.next;
           }
           curr.next=n;

       }
    }
    void Iterativeprint()
    {
        node curr=head;
        while(curr.next!=null)
        {
        System.out.print(curr.data+" ");
        curr=curr.next;
        }
         System.out.print(curr.data);
    }
  void printReverse(node curr) {
      // curr=head;
    if(curr.next != null) { // recurse until the last node is found
        printReverse(curr.next);  // print the next node first
    }
    System.out.println(curr.data+" "); // print out the node(this is only reached after the last node is found
}
    public static void main(String[] args)
    {
      task4 obj=new task4();
 
      obj.insert(1);
      obj.insert(2);
      obj.insert(3);
      obj.insert(4);
    
           double start=System.nanoTime();
      obj.Iterativeprint();
        double stop =System.nanoTime();
      double t= stop-start;
      System.out.println();
      System.out.println("Time taken by the Iterative print of linked list is:  "+ t);
      System.out.println();
        double s=System.nanoTime();
      node curr=obj.head;
      obj.printReverse(curr);
         double st =System.nanoTime();
      double T= st-s;
      System.out.println("Time taken by the Recursive print of linked list is:  "+ T);
    }
}