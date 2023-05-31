package Assignment1;

public class SearchInsertPosition {

	public static void main(String[] args) {
	   int[] arr= {1};
	   System.out.println(Solution1.searchInsert(arr, 2));

	}

}

class Solution1 {
    public static int searchInsert(int[] nums, int target) {
        int k=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(target<nums[0])k=0;
            else if(target>nums[nums.length-1])k=nums.length;
            else if(nums[i]==target)k=i;
            
        }
        for(int i=0;i<nums.length-1;i++){
        	if(nums[i]<target & nums[i+1]>target)k=i+1;
        
        }
        
        return k;
    }
}
