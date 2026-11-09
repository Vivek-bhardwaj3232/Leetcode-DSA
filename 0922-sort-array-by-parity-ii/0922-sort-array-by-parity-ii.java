class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even[] = new int[n/2];
        int odd[] = new int[n/2];
        int e = 0;
        int o = 0;
        for(int i=0; i<n; i++){
            if(nums[i]%2 == 0){
                even[e] = nums[i];
                e++;
            }else{
                odd[o] = nums[i];
                o++;
            }
        }

        int ans[] = new int[n];
        e = 0;
        o = 0;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                ans[i] = even[e];
                e++;
            }else{
                ans[i] = odd[o];
                o++;
            }
        }
        return ans;
    }
}