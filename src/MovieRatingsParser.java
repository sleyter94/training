/*
 * SD2x Homework #5
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MovieRatingsParser {

	public static TreeMap<String, PriorityQueue<Integer>> parseMovieRatings(List<UserMovieRating> allUsersRatings) {
		
		TreeMap<String, PriorityQueue<Integer>> response = new TreeMap<>();
		
		if(allUsersRatings==null || allUsersRatings.isEmpty()) return response;
		for(UserMovieRating umr : allUsersRatings) {
			if(umr != null && umr.getMovie() != null && !umr.getMovie().isEmpty() && umr.getUserRating()>0) {
				if(response.containsKey(umr.getMovie().toLowerCase())) {
					PriorityQueue<Integer> co = response.get(umr.getMovie().toLowerCase());
					co.add(umr.getUserRating());
					response.put(umr.getMovie().toLowerCase(), co);
				}else {
					PriorityQueue<Integer> cola = new PriorityQueue<>();
					cola.add(umr.getUserRating());
					response.put(umr.getMovie().toLowerCase(), cola);
				}
			}
		}
		return response; // this line is here only so this code will compile if you don't modify it
	}

}
