package training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class commonCharacterCount {

	static int count(String s1,String s2) {
		Map<Character, Integer> l1 = new HashMap<>();
		int total = 0;
		for(Character c1 : s1.toCharArray()) {
			if(l1.containsKey(c1)) {
				l1.put(c1, l1.get(c1)+1);
			}else {
				l1.put(c1, 1);
			}
		}
		for(Character c2 : s2.toCharArray()) {
			if(l1.containsKey(c2)) {
				total++;
				if(l1.get(c2) != 1)
					l1.put(c2, l1.get(c2)-1);
				else
					l1.remove(c2);
			}
		}
		return total;
	}
	
	static boolean isLucky(int n) {
		String r = String.valueOf(n);
		String r1 = r.substring(0, (r.length()/2));
		String r2 = r.substring((r.length()/2));
		Integer n1 = Integer.valueOf(r1);
		Integer n2 = Integer.valueOf(r2);
		int a1 = 0;int a2 =0;
		while(n1!=0) {
			a1+=n1%10;
			a2+=n2%10;
			n1 = n1/10;
			n2 = n2/10;
		}
		if(a1 == a2)
			return true;
		else
			return false;
		
		
	}
	
	int[] sortByHeight(int[] a) {
		int aux = 0;
		for(int i = 0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j] && a[i] != -1 && a[j] != -1) {
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		return a;
	}
	
	static String reverseParentheses(String s) {
		String response = "";
	    int pi = s.lastIndexOf("(");
	    if(pi<0)
	        return s;
	    int pf = s.substring(pi).indexOf(")") + pi;
	    char[] cs = s.toCharArray();
	    for(int i=0;i<cs.length;i++) {
	        if(i == pi) {
	            i++;
	            for(int j = pf-1;j>=pi+1;j--) {
	                i++;
	                response = response.concat(String.valueOf(cs[j]));
	            }
	            i++;
	        }
	        if(cs.length>i)
	            response = response.concat(String.valueOf(cs[i]));
	    }
	    if(response.indexOf(")")>-1) {
	        return reverseParentheses(response);
	    }else {
	        return response;
	    }
	}
	
	public static void main(String... args) {
		System.out.println(commonCharacterCount.reverseParentheses("Where are the parentheses?"));
	}
	
}
