/**

        * File: Lesson 5.7 - Arraylists

        * Author: Owais Ali Khan

        * Date Created: May 6, 2026

        * Date Last Modified: May 6, 2026

        */

import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void swap(ArrayList<String> arrL, int idx1, int idx2) {
	    String temp = arrL.get(idx1);
	    arrL.set(idx1, arrL.get(idx2));
	    arrL.set(idx2, temp);
	}
	
	public static ArrayList<Double> createArrayList(double[] arr) {
	    ArrayList<Double> arrL = new ArrayList<>();
	    for (int i = 0 ; i < arr.length; i++) {
	        arrL.add(arr[i]);
	    }
	    return arrL;
	}
	 
	public static ArrayList<Integer> mergeLists(ArrayList<Integer> arrL1, ArrayList<Integer> arrL2) {
	    ArrayList<Integer> result = new ArrayList<>(arrL1);
		result.addAll(arrL2);
		return result;
	}

}
