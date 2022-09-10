import java.util.*;
 // A linked list node
 class Node
 {
     int data; // integer data
 Node next; // pointer to the next node
 };

 class Stack
{
   // node head=null;
     private Node top;

 public Stack() {
 this.top = null;
 }

 // Utility function to add an element x in the stack
 public void push(int x) // insert at the beginning
 {
     Node nn=new Node();
     nn.data=x;
     nn.next=null;

if(top==null)
{
   // head=nn;
   System.out.println("Inserting   "+x );
    top=nn;
}      
else{
    System.out.println("Inserting   "+x );
nn.next=top;
top=nn;
}
 }
 // Write your code here
 

 // Utility function to check if the stack is empty or not
 public boolean isEmpty()
 {
     if(top==null)
     return true;
     else
     return false;
 // Write your code here
 }

 // Utility function to return top element in a stack
 public int peek()
 {
     return top.data;
     // Write your code here
 }

 // Utility function to pop top element from the stack and check for Stack underflow

 public void pop() // remove at the beginning
 {
     System.out.println("Removing   " +top.data);
     top=top.next;
 // Write your code here
 }
 }

 class StackImpl
 {
 public static void main(String[] args)
 {
 Stack stack = new Stack();

 stack.push(1);
 stack.push(2);
 stack.push(3);

 System.out.println("Top element is " + stack.peek());
 

 stack.pop();
 stack.pop();
 stack.pop();
 if (stack.isEmpty()) 
{ System.out.print("Stack is empty");
 } else {
 System.out.print("Stack is not empty");
 }
 }
} 