package basicProblems;

public class countTarget {
	public int countTar(int[] nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == target)
				count++;

		return count;
	}
}
