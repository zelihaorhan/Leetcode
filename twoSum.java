/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class twoSum {

    public int[] TwoSum(int[] nums, int target) {
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                else if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return null;
    }
}