package pq_unsorted_array;

public class PriorityQueueUsingUnsortedArray {
	// create an array
	private int siz;		//size of array
	private int arr[];
	private int n;			//no. of elements in array
	  
    // constructor
    public PriorityQueueUsingUnsortedArray() {
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
    	arr[n++] = data;
    }
    
    public int extractMax() {   	 
    	// return and remove max value from array
    	// handle all possible exceptions/errors
    	if(isEmpty()) {
        	System.out.println("ERROR! Queue is Empty");
        	return 0;
        }
    	int i,res, max = 0;
    	//finding max priority
    	for(i=1; i<n; i++) {
    		if(arr[max]<arr[i]) {
    			max = i;
    		}
    	}
    	res = arr[max];			// max value
    	arr[max] = arr[n-1]; 	// replace max value with last value of array
    	n--;				// decreasing number of elements
    	return res;
    }
    
    public int getMax() {      	 
    	// just return max value from array
    	// handle all possible exceptions/errors
    	if(isEmpty()) {
        	System.out.println("ERROR! Queue is Empty");
        	return 0;
        }
    	int max=arr[0];
    	for(int i=1; i<n; i++) {
    		if(arr[i]>max)
    			max = arr[i];
    	}
    	return max;
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
    	PriorityQueueUsingUnsortedArray pq = new PriorityQueueUsingUnsortedArray();
    	
    	// insert some values using insert method
    	System.out.print("//array size = 5\n");
    	pq.insert(2);
    	pq.insert(8);
    	pq.insert(6);
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
    	pq.insert(7);
    	pq.insert(9);
    	System.out.println("\nvalues add: ");
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
