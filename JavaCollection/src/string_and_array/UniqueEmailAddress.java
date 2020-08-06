package string_and_array;

// 주어진 3개의 문자열을 비교한 뒤 @ 이후의 문자열이 일치할 경우 같다고 출력 

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
		
	}
}
