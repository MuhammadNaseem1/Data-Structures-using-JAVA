import java.util.*;

 // Class for queue
 class Queue
 {
 private int arr[];
 private int front;
 private int rear;
 private int capacity;
 private int count;

 // Constructor to initialize queue
 Queue(int size)
 {
 arr = new int[size];
 capacity = size;
 front = -1;
 rear = -1;
 count = 0;
 }

 // Utility function to remove front element from the queue and check for Queue Underflow
 public void dequeue()
 {
    
     System.out.println("Removing  "+arr[front++]);
    //++front;
    count--;
 // Write your code here
 }

 // Utility function to add an item to the queue and check for queue overflow
 public void enqueue(int item)
 {
     if(isEmpty())
     {
         System.out.println("Inserting   "+item);
     arr[++rear]=item;
     front=0;
     count++;
     }
     else if(!isEmpty()){
           System.out.println("Inserting   "+item);
             arr[++rear]=item;
          count++;
     }
     else{
            System.out.println("Queue is full");
       
     }
 // Write your code here
 }

 // Utility function to return front element in the queue and check for Queue Underflow
 public int peek()
 {
     return arr[front];
 // Write your code here
 }

 // Utility function to return the size of the queue
 public int size()
 {
     return count;
 // Write your code here
 }

 // Utility function to check if the queue is empty or not
 public Boolean isEmpty()
 {
     if( front>rear||front==-1 || rear==front)
         return true;
       else
      return false;
 // Write your code here 
//Lab 03- Stacks, Queues Spring 2021
//Data Structures & Applications by Saif HassanSukkur IBA University
 }

// Utility function to check if the queue is empty or not
 public Boolean isFull()
 {
     if(rear==capacity)
       return true;
            else 
            return false;
     // Write your code here
 }
 }

 class Main
 {
 // main function
 public static void main (String[] args)
 {
 // create a queue of capacity 5
 Queue q = new Queue(5);

 q.enqueue(1);
 q.enqueue(2);
 q.enqueue(3);

 System.out.println("Front element is: " + q.peek());
 q.dequeue();
 System.out.println("Front element is: " + q.peek());

 System.out.println("Queue size is " + q.size());

 q.dequeue();
 q.dequeue();

 if (q.isEmpty())
 System.out.println("Queue Is Empty");
 else
 System.out.println("Queue Is Not Empty");
 }
 } 