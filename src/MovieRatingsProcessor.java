/*
 * SD2x Homework #5
 * Implement the methods below according to the specification in the assignment description.
 * Please be sure not to change the method signatures!
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;


public class MovieRatingsProcessor {

	public static List<String> getAlphabeticalMovies(TreeMap<String, PriorityQueue<Integer>> movieRatings) {
		List<String> response = new ArrayList<>();
		if(movieRatings == null || movieRatings.isEmpty()) return response;
		for(String title : movieRatings.keySet()) {
			response.add(title);
		}
		Collections.sort(response);
		return response; // this line is here only so this code will compile if you don't modify it
	}

	public static List<String> getAlphabeticalMoviesAboveRating(TreeMap<String, PriorityQueue<Integer>> movieRatings, int rating) {
		List<String> response = new ArrayList<>();
		if(movieRatings == null || movieRatings.isEmpty()) return response;
		for(String title : movieRatings.keySet()) {
			if(movieRatings.get(title).peek()>rating) {
				response.add(title);
			}
		}
		Collections.sort(response);
		return response;
	}
	
	public static TreeMap<String, Integer> removeAllRatingsBelow(TreeMap<String, PriorityQueue<Integer>> movieRatings, int rating) {
		TreeMap<String,Integer> response = new TreeMap<>();
		if(movieRatings == null || movieRatings.isEmpty()) return response;
		List<String> del = new ArrayList<>();
		for(String title : movieRatings.keySet()) {
			boolean delete = false;int counter = 0;
			if(movieRatings.get(title).isEmpty()) {
				response.put(title, counter);
				continue;
			}
			while(movieRatings.get(title).peek() != null && movieRatings.get(title).peek()<rating) {
				movieRatings.get(title).poll();
				counter ++;
				if(response.containsKey(title)) {
					response.put(title,response.get(title)+1);
				}else {
					response.put(title, 1);
				}
			}
			if(movieRatings.get(title).peek() == null) {
				del.add(title);
				//movieRatings.remove(title);
			}
			
		}
		for(String d : del) {
			movieRatings.remove(d);
		}
		return response; // this line is here only so this code will compile if you don't modify it
	}
}
