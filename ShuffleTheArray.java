
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans =new int[nums.length];
        for(int i=0,j=0;j<nums.length;i++,j=j+2){
            ans[j]=nums[i];
            ans[j+1]=nums[i+nums.length/2];
        }
        return ans;
    }
} 