package strings;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings02 {
	public boolean isIsomorphic2(String s, String t) {
	    if(s.length() != t.length()) {
	        return false;
	    }
	 
	    HashMap<Character, Character> map = new HashMap<>();
	    for (int i=0; i<s.length(); i++) {
	        char c1=s.charAt(i);
	        char c2=t.charAt(i);
	 
	        if(map.containsKey(c1)) {
	            if(map.get(c1) != c2) {
	                return false;
	            }
	        }else{
	            map.put(c1, c2);
	        }
	    }
	 
	    HashSet<Character> set=new HashSet<>(map.values());
	    if (set.size()==map.values().size()) {
	        return true;
	    }
	 
	    return false;
	}
	
	public boolean isIsomorphic(String s, String t) {
	    if(s.length() != t.length()) {
	        return false;
	    }
	 
	    HashMap<Character, Character> map=new HashMap<>();
	    for (int i=0; i<s.length(); i++) {
	        char c1=s.charAt(i);
	        char c2=t.charAt(i);
	 
	        if(map.containsKey(c1)) {
	            if(map.get(c1) != c2) {
	                return false;
	            }
	        }else{
	            map.put(c1, c2);
	        }
	    }
	 
	    HashSet<Character> set=new HashSet<>(map.values());
	    if(set.size() == map.values().size()) {
	        return true;
	    }
	 
	    return false;
	}
}
