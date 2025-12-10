class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for(i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i + 1] == nums[i]) break;
        }
        return nums[i];
    }
}