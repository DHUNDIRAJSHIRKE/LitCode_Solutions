package Q_1_Two_Sum;

/*Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 *You may assume that each input would have exactly one solution, 
 *and you may not use the same element twice.
 *You can return the answer in any order.
 */
class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					if ((nums[i] + nums[j]) == target) {
						arr[0] = i;
						arr[1] = j;
						break;
					}
				}
			}
		}
		return arr;
	}
}