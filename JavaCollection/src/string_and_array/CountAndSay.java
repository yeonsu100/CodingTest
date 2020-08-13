package string_and_array;

public class CountAndSay {
	public String countAndSay(int n) {
		if(n<=0) return null;
		String result="1";
		int i=1;
		
		while(i<n) {
			StringBuilder sb=new StringBuilder();
			int count=1;
			
			for(int j=1; j<result.length(); j++) {
				if(result.charAt(j)==result.charAt(j-1)) {
					count++;
				}else {
					count=1;
				}
			}
		}
	}
	return result;
}
