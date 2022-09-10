import java.util.*;
class task6
{
     // Stack s;
    class node
    {
      
        int data;
        node next,prev;
        node()
        {
            next=null;
            prev=null;
        }
           }
    node head=null;
   void push(int data)
   {
       node n=new node();
       n.data=data;
       n.next=null;
       if(head==null){
       head=n;
        
       }
       else
       {
           n.next=head;
           head=n;
       }

       System.out.println("successfully inserted");

   }
   int pop()
   {
       System.out.println("the pop element is "+ head.data);
       int temp=head.data;
       head=head.next;
       return head.data;

   }
   void ReversePrint(node head)
   {
       node curr=head;
       while(curr.next!=null)
       {
           System.out.print(curr.data+" ");
           curr=curr.next;
       }
         System.out.print(curr.data+" ");
   }

   public node makeReverse(node head)
   {
         node n=new node();
       node c=head;
       while(head.next!=null)
       {
             n.data=head.data;
             head=head.next;
       }
      n.data=head.data;
       return c;
   }
      boolean detectCycle()
      {
          boolean bool=false;
          node curr=head;
          while(curr.next!=null)
          {
              if(curr.prev!=null)
              {
                  bool=true;
                  break;
              }
              else
              curr=curr.next;
          }
          return bool;

      }
   public static void main(String[] args)
   {
       task6 obj=new task6();
       obj.push(1);
       obj.push(2);
       obj.push(3);
     
       System.out.println();
       node a=obj.head;
 node list=obj.makeReverse(a);
  obj.ReversePrint(obj.head);
    System.out.println();
boolean f=obj.detectCycle();
if(f==true)
System.out.println("Cycle is detected in Linked List");
else
System.out.println("No Cycle is detected in Linked List");
   }

}