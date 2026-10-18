class Solution {
    public int singleNumber(int[] nums) {
        int cnt =0;
        for(int i=0;i<nums.length;i++){
            cnt=cnt^nums[i];
        }
        return cnt;
    }
}