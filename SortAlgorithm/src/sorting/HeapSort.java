package sorting;

public class HeapSort {
	public static void heapSort(int[] a) {
		int count=a.length;
		heapify(a, count);
		int end=count=1;
		while(end>0) {
			int tmp=a[end];
			a[end]=a[0];
			a[0]=tmp;
			siftDown(a, 0, end-1);
			end--;
		}
	}
	
	public static void heapify(int[] a, int count) {
		int start=(count-2)/2;
		while(start>=0) {
			siftDown(a, start, count-1);
			start--;
		}
	}
	
	public static void siftDown(int[] a, int start, int end) {
		int root=start;
		while((root*2+1)<=end) {
			int child=root*2+1;
			if(child+1<=end && a[child] < a[child+1]) {
				child=child+1;
			}
			if(a[root]<a[child]) {
				int tmp=a[root];
				a[root]=a[child];
				a[child]=tmp;
				root=child;
			}else {
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {7, -5, 3, 2, 1, 0, 45};
		int n=arr.length;
		HeapSort ob=new HeapSort();
		ob.heapSort(arr);
		System.out.println("Sorted array : ");
			for(int element: arr) {
				System.out.println(" "+element);
			}
	}
}
