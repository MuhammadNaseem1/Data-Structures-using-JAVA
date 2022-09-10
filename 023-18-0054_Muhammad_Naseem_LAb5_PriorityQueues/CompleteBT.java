
public class CompleteBT {
	
	private int size;	
	private int[] H;		
	private int maxSize;	
	
	
	public CompleteBT(){
		maxSize = 10;
		H = new int[maxSize];
		size = 0;
	}
	
	public int Parent(int i) {
		return (int)Math.floor(i/2);
	}
	public int LeftChild(int i) {
		return 2*i;
	}
	public int RightChild(int i) {
		return (2*i)+1;
	}
	public void insert(int p) {
		if(size == maxSize) {
			System.out.println("Tree is Full");
			return;
		}
		size = size+1;
		H[size] = p;
		ShiftUp(size);
	}
	public int ExtractMax() {
		int res = H[1];
		H[1] = H[size];
		size = size-1;
		ShiftDown(1);
		return res;
	}
	public void ShiftUp(int i) {
		while(i>1 && H[Parent(i)] < H[i]){
			Swap(H[Parent(i)] , H[i]);
		}
		i = Parent(i);
	}
	public void ShiftDown(int i) {
		int maxIndex = i;
		int l = LeftChild(i);
		if(l<=size && H[l]>H[maxIndex]) {
			maxIndex = l;
		}
		int r = RightChild(i);
		if(r<=size && H[r]>H[maxIndex]) {
			maxIndex = r;
		}
		if(i!=maxIndex) {
			Swap(H[i] , H[maxIndex]);
			ShiftDown(maxIndex);
		}
	}
	public void Remove(int i) {
		H[i] = H[1]+10;
		ShiftUp(i);
		ExtractMax();
	}
	public void ChangePriority(int i, int p) {
		int oldP = H[i];
		H[i] = p;
		if(p>oldP) {
			ShiftUp(i);
		}
		else {
			ShiftDown(i);
		}
	}
	public void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		
		CompleteBT bt = new CompleteBinaryTree();
		bt.insert(6);
		bt.insert(2);
		System.out.println("jdfhd");
	}

}
