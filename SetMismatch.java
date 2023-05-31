package Assignment1;

import java.util.*;

class Solution {
	public int[] findErrorNums(int[] arr) {

		int[] result = new int[2];
		Map<Integer, Boolean> number = new HashMap<>();

		int max = arr.length;

		for (Integer i : arr) {

			if (number.get(i) == null) {
				number.put(i, true);
			} else {
				result[0] = i;
			}
		}
		for (int i = 1; i <= max; i++) {
			if (number.get(i) == null) {
				result[1] = i;
			}
		}
		return result;
	}
}
