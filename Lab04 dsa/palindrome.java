class linkedlist{
class node
{
    int data;
    node next,prev;
}
   node head=null;
  node tail=null;

    void add(int data)
    {
        node n=new node();
        n.data=data;
              if(head==null)
              {
                  head=n;
                  tail=n;
              }
              else{
                  node curr=head;
                  while(curr.next!=null)
                  {
                      curr=curr.next;
                  }
                  curr.next=n;
                  n.prev=curr;
                  tail=n;
              }
    }
    boolean isPalindrome()
    {
        boolean b=false;
        node curr1=head;
        node curr2=tail;
        while(curr1!=curr2)
        {
                 if(curr1.data!=curr2.data)
                 {
                     b= false;
                   break;

                 }
                 else{
                curr1=curr1.next;
                     curr2=curr2.prev;
                     b=true;
                 }
        }
       if(b==true)
       {
           if(curr1.data==curr2.data)
           {
               b=true;
           }
           
       }
        return b;
    } 
}

class palindrome
{
   public static void main(String[] args)
   {
    linkedlist obj=new linkedlist();
    obj.add(1);
    obj.add(2);
    obj.add(1);


    boolean a=obj.isPalindrome();
    if(a)
    System.out.println("It is palindrome");
    else
    System.out.println("It is not a palindrome");

   }
}