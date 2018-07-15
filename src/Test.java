import java.util.PriorityQueue;
import java.util.TreeMap;

public class Test {
	static TreeMap<String, PriorityQueue<Integer>> map;
	
	public static void main(String...strings) {
		map = new TreeMap();
	    
	    PriorityQueue localPriorityQueue1 = new PriorityQueue();
	    localPriorityQueue1.add(Integer.valueOf(3));
	    localPriorityQueue1.add(Integer.valueOf(5));
	    map.put("sabrina", localPriorityQueue1);
	    
	    PriorityQueue localPriorityQueue2 = new PriorityQueue();
	    localPriorityQueue2.add(Integer.valueOf(4));
	    localPriorityQueue2.add(Integer.valueOf(1));
	    map.put("inception", localPriorityQueue2);
	    
	    PriorityQueue localPriorityQueue3 = new PriorityQueue();
	    localPriorityQueue3.add(Integer.valueOf(4));
	    localPriorityQueue3.add(Integer.valueOf(5));
	    localPriorityQueue3.add(Integer.valueOf(1));
	    localPriorityQueue3.add(Integer.valueOf(1));
	    localPriorityQueue3.add(Integer.valueOf(5));
	    map.put("ratatouille", localPriorityQueue3);
	    
	    PriorityQueue localPriorityQueue4 = new PriorityQueue();
	    localPriorityQueue4.add(Integer.valueOf(4));
	    localPriorityQueue4.add(Integer.valueOf(3));
	    map.put("grease", localPriorityQueue4);
	    TreeMap localTreeMap = MovieRatingsProcessor.removeAllRatingsBelow(map, 10);
	    localTreeMap.get("sabrina");
	    
	}
}
