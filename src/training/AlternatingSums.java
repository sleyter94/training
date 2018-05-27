package training;

import java.util.Arrays;

public class AlternatingSums {

	int[] alternatingSums(int[] a) {
		int[] result = new int[2];
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				result[0]+=a[i];
			}else {
				result[1]+=a[i];
			}
		}
		
		return result;
	}
	
	String[] addBorder(String[] picture) {
		String[] result = new String[picture.length+2];
		String first = "";
		for(int i=0;i<picture[0].length();i++) {
			first+="*";
		}
		for(int i=0;i<picture.length;i++) {
			result[i+1] = "*" + picture[i] + "*";
		}
		result[0] = first+"**";
		result[result.length-1] = first+"**";
		return result;
	}
	
	boolean areSimilar(int[] a, int[] b) {
		int[] a2 = a.clone();
		int[] b2 = b.clone();
		int count = 0;
		Arrays.sort(a2);
		Arrays.sort(b2);
		if(Arrays.equals(a2, b2)) {
			for(int i = 0;i<a.length;i++) {
				if(a[i] != b[i]) {
					count++;
				}
				if(count>2) {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
	}
	
	int arrayChange(int[] inputArray) {
		int response = 0;
		for(int i=1;i<inputArray.length;i++) {
			while(inputArray[i]<=inputArray[i-1]) {
				inputArray[i]++;
				response++;
			}
		}
		return response;
	}
	
	
}
