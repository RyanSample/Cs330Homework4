import java.lang.Math;
public class Heap {
	int currentNode,totalElements;
	private int a[];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int b[] = {3,6,5,10,4,2,9,7,1,8};
		
		// TODO Auto-generated method stub
		Heap heap = new Heap();
		for(int i=0;i<b.length;i++)
			heap.addElement(b[i]);
		
		System.out.println(heap.toString());
	}
	public Heap(){
		totalElements=0;
		currentNode=0;
		a= new int[10];
		for(int i=0;i<9;i++){
			a[i]='\0';
		}
	}
	
	public boolean addElement(int element){
		if(totalElements==10)
			return false;		
		if(currentNode>=a.length)
			return false;
		a[currentNode]=element;
		totalElements++;
		currentNode++;
		return true;
	}
	public boolean removeElement(int location){
		return true;
	}
	//returns the value of the left child
	public int leftChild(int currentIndex){
		int leftloc;
		leftloc=currentIndex*2;
		return a[leftloc];
	}
	//returns the value of the right child
	public int rightChild(){
		
		return 0;
	}
	public int goToParent(){
		return 0;
	}
	public void reheapify(){//develop this method next
		int temp;//temp variable,
	}
	
	public String toString(){
		int current;
		String array = new String();
		for(int i=0;i<10;i++){
			if((current=a[i])=='\0')
				array=array+' ';
			else
				array=array+current;
		}
			
		return array;
	}
}
