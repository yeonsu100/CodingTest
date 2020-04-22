package overseas;

import java.util.*;

public class ArrayList {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("101");
		list.add("1001");
		list.add("10001");
		
		System.out.println(list.size());
		System.out.println("While Loop : ");
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Advanced For Loop : ");
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("For Loop : ");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] size() {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(String string) {
		// TODO Auto-generated method stub
		
	}
}
