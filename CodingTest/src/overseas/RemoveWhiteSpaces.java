package overseas;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str1="Show yourself   I'm ready to learn		Ah ah ah ah";
		char[] chars=str1.toCharArray();
		StringBuffer sb=new StringBuffer();
		
		for(int i=0; i<chars.length; i++) {
			if( (chars[i]!=' ') && (chars[i]!= '\t') ) {
				sb.append(chars[i]);
			}
		}
		System.out.println(sb);
	}
}
