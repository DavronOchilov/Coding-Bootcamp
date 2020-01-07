package basicProblems;

public class sumOfArray {
	public int arraySum(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i];
		return sum;
	}
}
