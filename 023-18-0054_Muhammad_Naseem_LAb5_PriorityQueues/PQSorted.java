package pq_sorted_array;

public class PriorityQueueUsingSortedArray {

	// create an array
	private int siz;		//array size
	private int arr[];		
	private int n;			//no. of elements in array
	
    // constructor
    public PriorityQueueUsingSortedArray() {
	// initialize an array
    	siz = 5;
    	arr = new int[siz];
    	n=0;
	
    }
    public void insert(int data) {    	 
    	// insert data in array in any order
    	// handle all possible exceptions/errors        
    	if(isFull()) {
    		System.out.println("ERROR! Queue is Full");
    		System.exit(0);
    	}
    	if(n==0) {
    		arr[n]=data;
    		n++;
    		return;
    	}
    	int i;
    	for(i=n-1; i>=0; i--) {
    		if(data<arr[i]) {
    			arr[i+1] = arr[i];
    		}
    		else{
    			break;
    		}
    	}
    	arr[i+1] = data;
    	n++;
    	
    }
    
    public int extractMax() {   	 
    	// return and remove max value from array
    	// handle all possible exceptions/errors
    	if(isEmpty()) {
        	System.out.println("ERROR! Queue is Empty");
        	return 0;
        }
    	int res = arr[n-1];
    	n--;
    	return res;
    }
    
    public int getMax() {      	 
    	// just return max value from array
    	// handle all possible exceptions/errors
    	if(isEmpty()) {
        	System.out.println("ERROR! Queue is Empty");
        	return 0;
        }
    	return arr[n-1]; 
    }
    
    public boolean searchData(int data) {      	 
    	// search data from array
    	// handle all possible exceptions/errors
    	if(isEmpty()) {
        	System.out.println("ERROR! Queue is Empty");
        	return false;
        }
    	for(int i=0; i<n; i++) {
    		if(arr[i]==data) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean isFull() {
    	return n==siz;
    }
    public boolean isEmpty() {
    	return n==0;
    }
    public int size() {
    	return n;
    }
    public void printPQ() {
    	for(int i=0; i<n; i++) {
    		System.out.print(arr[i]+",");
    	}
    }
    
    public static void main(String[] args)   
    {   
        // Test the main method by creating object for PriorityQueueUsingArray class
    	PriorityQueueUsingSortedArray pq = new PriorityQueueUsingSortedArray();
    	
    	// insert some values using insert method
    	System.out.print("//array size = 5\n");
    	pq.insert(3);
    	pq.insert(7);
    	pq.insert(5);
    	pq.insert(1);
    	pq.printPQ();
    	System.out.print("\n===================================");
    	
    	// call extractMax method and print output
    	System.out.println("\nextractMax called: "+pq.extractMax());
    	pq.printPQ();
    	System.out.print("\n===================================");
    	
    	// call extractMax method and print output
    	System.out.println("\nextractMax called: "+pq.extractMax());
    	pq.printPQ();
    	System.out.print("\n===================================");
    	
    	// insert some values using insert method
    	pq.insert(2);
    	pq.insert(6);
    	System.out.println("\nValues addes:");
    	pq.printPQ();
    	System.out.print("\n===================================");
    	
    	// call getMax method and print output
    	System.out.println("\ngetMax called: "+pq.getMax());
    	pq.printPQ();
    	System.out.print("\n===================================");
    	
    	// call extractMax method and print output
    	System.out.println("\nextractMax called: "+pq.extractMax());
    	pq.printPQ();
    	
    }   

}
