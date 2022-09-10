class node{
    String name;
    node next;
    node prev;

    node(String name)
    {
        this.name=name;
        next=null;
        prev=null;
    }
}

class list{

    node head=null;

    void insertSingle(node n)
    {
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
void displaySinglee()
{
  node curr=head;
  while(curr!=null)
  {
      System.out.print(curr.name+" ");
      curr=curr.next;
  }
}
void doublee(node n)
{
         if(head==null)
        {
          head=n;
        }
    else{
        node curr=head;
       // node back;
        while(curr.next!=null)
        {
           //back=curr;
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
}
public void checkCycleSinglee()
{
     boolean f=false;
  node curr=head;
  while(curr.prev!=null)
{
   curr=curr.next;
   if(curr.prev!=null)
   {
       f=true;
       break;
   }
   
   else {
       
   }
}
if(f==true){
System.out.println("There is cycle in the Linked List");
}
else
{
    System.out.println("No cycle in the Linked List");
}
}

public void checkCycleDoublee()
{
    boolean f=false;
  node curr=head;
  while(curr.prev==null)
{
   curr=curr.next;
   if(curr.prev!=null)
   {
       f=true;
       break;
   }
   
   else {
       
   }
}
if(f==true){
System.out.println("There is cycle in the Linked List");
}
else
{
    System.out.println("No cycle in the Linked List");
}
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
 obj.insertSingle(node1);
  obj.insertSingle(node2);
   obj.insertSingle(node3);
    obj.insertSingle(node4);
obj.insertSingle(node5);
   // obj.circular(node6);
     obj.displaySinglee();
// obj.doublee(node1);
//   obj.doublee(node2);
//    obj.doublee(node3);
//     obj.doublee(node4);
// obj.doublee(node5);
//      obj.display();
     //obj.insertAtMid(node6,"Maseeh");
  //   obj.display();
    // obj.insertAtBeginning("Naseem");
  //obj.circular(node6);
// obj.display();
 //obj.displayCircular();
 
 obj.checkCycleSinglee();
}
}
