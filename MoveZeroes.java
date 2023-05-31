package Assignment1;

import java.util.Arrays;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int count = 0;
		int zerocount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[count] = nums[i];
				count++;
			} else {
				zerocount++;
			}

		}
		for (int i = nums.length - zerocount; i < nums.length; i++) {
			nums[i] = 0;
		}
		System.out.print(Arrays.toString(nums));
	}
}
