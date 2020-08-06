package string_and_array;

import java.util.HashSet;
import java.util.Set;

/* 주어진 3개의 문자열을 비교한 뒤 @ 이후의 문자열이 일치할 경우 같다고 출력 
* 1) Continue로 뺀다
* 2) + break로 뺀다
* 3) Set<String>
*/

public class UniqueEmailAddress {
	public static void main(String[] args) {
		UniqueEmailAddress a=new UniqueEmailAddress();
		String[] emails= {"test.email+james@coding.com",
						"test.e.mail+toto.jane@coding.com",
						"testmail+tom@sod.ing.com"
						};
		System.out.println(a.numUniqueEmails(emails));
	}
	
	public int numUniqueEmails(String[] emails) {
		// 중복을 피하기 위해 Set<String>을 이용한다 
		Set<String> set=new HashSet<>();
		
		for(String email: emails) {
			String localName=makeLocalName(email);		// test email
			String domainName=makeDomainName(email);	// after @
		
			// set에 넣어 @를 기준으로 다시 연결시켜준다  
			set.add(localName+"@"+domainName);
		}
		return set.size(); 			// output : 2
	}
	
	private String makeLocalName(String email) {
		// StringBuilder 이용 
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<email.length(); i++) {
			// 에러 체크 조건 
			if(email.charAt(i)=='.') {
				continue;
			}
			if(email.charAt(i)=='+') {
				break;
			}
			if(email.charAt(i)=='@') {
				break;
			}
			
			// append에 담는다 
			String str=String.valueOf(email.charAt(i));
			sb.append(str);
		}
		return sb.toString();
	}
	private String makeDomainName(String email) {
		return email.substring(email.indexOf('@')+1);	// @가 아니라 @ 바로 뒤부터 필요하므로 +1
	}
}
