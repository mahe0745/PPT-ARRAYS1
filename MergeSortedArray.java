package Assignment1;

import java.util.Arrays;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] arr = new int[nums1.length];
		int k = 0;
		for (int i = nums1.length - n; i < nums1.length; i++) {
			nums1[i] = nums2[k++];
		}
		Arrays.sort(nums1);
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}
}
