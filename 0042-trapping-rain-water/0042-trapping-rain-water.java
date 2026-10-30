class Solution {
    public int trap(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        
        int leftMax = nums[left];
        int rightMax = nums[right];
        int water = 0;

        while(left<right){
            if(leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax,nums[left]);
                water += leftMax-nums[left];
            }else{
                right--;
                rightMax = Math.max(rightMax,nums[right]);
                water += rightMax-nums[right];
            }
        }
        return water;
    }
}