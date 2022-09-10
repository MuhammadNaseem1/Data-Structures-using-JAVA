import java.util.*;
import java.io.*;
class node{
  String name;
  node next;
  node prev;

  public node(String name)
  {
    this.name=name;
    next=null;
    prev=null;
    //size=0;
  }
}
class list{
 
  //int size=0;
 node head=null;
  boolean isEmpty()
  {
    if(head==null)
    {
      return true;
    }
    else 
    return false;
  }
  void insertAtBeginning(node n)
  {
     if(isEmpty())
     {
         head=n;
     }
else{
    n.next=head;
    head.prev=n;
    head=n;
}
  }
  void insertAtBeginning(String name)
  {
node n=new node(name);
    {
     if(isEmpty())
     {
         head=n;
     }
else{
    n.next=head;
    head.prev=n;
    head=n;
}
  }
  }
void insert(node n)
{
 if(isEmpty()){
 head=n;
 //size++;
 }
 else{
  node curr=head;
while(curr.next!=null)
{
  curr=curr.next;

}
curr.next=n;
n.prev=curr;
 }
}
void display()
{
  node curr=head;
  while(curr!=null)
  {
    System.out.print(curr.name+" ");
    curr=curr.next;
  }
  System.out.println();
 // System.out.print(curr.data);
}

void insertAtMid(node n,String name)
{
  if(isEmpty())
  System.out.println("list is empty");
  else{
        node curr=head;
        node back=null;
        while(curr.name!=name)
        {
            back=curr;
            curr=curr.next;
        }
    node  temp=back.next;
      back.next=n;
      curr.prev=back;
      n.next=temp;
      curr.prev=n;
//      size++;

  }
}
void circular(node n){
node curr=head;
while(curr.next!=null)
{
  curr=curr.next;
}
curr.next=n;
n.prev=curr;
n.next=head;
}

void displayCircular()
{
  //int a=1;
  node curr=head;
  while(curr.next!=head)
  {
    System.out.print(curr.name+" ");
    curr=curr.next;
  }
  System.out.print(curr.name+" ");
}
public static void main(String[] args)
{
  node node1 =new node("Naseem");
  node node2 =new node("Loang khan");
  node node3 =new node("Irfan Ali");
  node node4 =new node("Maseeh");
  node node5 =new node("Waseem");
  node node6 =new node("Amin");

  list obj=new list();
 // obj.insert(node1);
  obj.insert(node2);
   obj.insert(node3);
    obj.insert(node4);
obj.insert(node5);
   //  obj.circular(node6);
     obj.display();
     obj.insertAtMid(node6,"Maseeh");
  //   obj.display();
     obj.insertAtBeginning("Naseem");
  obj.circular(node6);
// obj.display();
 obj.displayCircular();
}
}
