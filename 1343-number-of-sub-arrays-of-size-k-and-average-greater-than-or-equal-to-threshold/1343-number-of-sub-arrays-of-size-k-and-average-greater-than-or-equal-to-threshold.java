class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, count = 0,range=k*threshold;

        for (int i = 0; i <= k - 1; i++) {
            sum += arr[i];
        }
        if(sum>=range){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            if(sum>=range){
                count++;
            }
        }
        return count;
    }
}