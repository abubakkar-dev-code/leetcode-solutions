class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            left[i] = product;
        }
        product=1;
        for (int i = nums.length-1; i >=0; i--) {
            product *= nums[i];
            right[i] = product;
        }
        int res[]=new int[n];
        res[0]=right[1];
        res[n-1]=left[n-2];
        for(int i=1;i<nums.length-1;i++){
            res[i]=left[i-1]*right[i+1];
        }
        return res;
    }
}