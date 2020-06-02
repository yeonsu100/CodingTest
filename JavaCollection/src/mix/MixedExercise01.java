package mix;

public class MixedExercise01 {
	public static void main(String[] args) {
		String[] arr= {"Snow White", "Elsa", "Ariel", 
					"Tiana", "Mulan", "Rapunzel", "Elsa", 
					"Bell", "Cinderella", "Anna"};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i].equals(arr[j])) && (i!=j)) {
					System.out.println("Duplicate element is "+arr[j]);
				}
			}
		}
	}
}
