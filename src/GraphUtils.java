

import java.util.List;
import java.util.Set;

/*
 * SD2x Homework #6
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the signature of any of the methods!
 */

public class GraphUtils {

	public static int minDistance(Graph graph, String src, String dest) {

		if(graph==null || src == null || dest == null || !graph.containsElement(src) || !graph.containsElement(dest)) {
			return -1;
		}
		if(src.equals(dest)) {
			return 0;
		}
		return -2;
	}
	

	public static Set<String> nodesWithinDistance(Graph graph, String src, int distance) {

		if(graph ==null || src == null || !graph.containsElement(src) || distance < 1) {
			return null;
		}
		
		return null; // this line is here only so this code will compile if you don't modify it
	}


	public static boolean isHamiltonianPath(Graph g, List<String> values) {

		if(g == null || values == null) {
			return false;
		}
		
		return true; // this line is here only so this code will compile if you don't modify it
	}
	
}
