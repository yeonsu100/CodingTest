package overseas;

public class SecondHighestNumberInArray {
	public static void main(String[] args) {
		int arr[]= {5, 17, 101, 86, 22, 49, 57, 219, 222, 94, 60, 38, 145, 29};
		int largest=0;
		int scdLargest=0;
		System.out.println("The given array is : ");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				scdLargest=largest;
				largest=arr[i];
			}else if(arr[i]>scdLargest) {
				scdLargest=arr[i];
			}
		}
		System.out.println("\nSecond largest number is "+scdLargest);
		System.out.println("Largest number is "+largest);
	}
}
