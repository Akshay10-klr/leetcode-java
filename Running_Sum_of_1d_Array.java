class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=nums.length-1;i>=0;i--){
            for(int j=i;j>0;j--){
                nums[i]=nums[i]+nums[j-1];
            }
        }
        return nums;
    }
}
//better version
// class Solution {
//     public int[] runningSum(int[] nums) {
//         for(int i=1; i<nums.length; i++){
//             nums[i] = nums[i]+nums[i-1];
//         }
//         return nums;
//     }
// }