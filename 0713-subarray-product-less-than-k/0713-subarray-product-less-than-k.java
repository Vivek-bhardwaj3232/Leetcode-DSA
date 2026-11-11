class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int cnt = 0;
        int j = 0;
        long prod = 1;
        for(int i=0; i<nums.length; i++){
            prod *= nums[i];
            while(prod >= k){
                prod /= nums[j];
                j++;
            }
            cnt += i-j+1;
        }
        return cnt;
    }
}