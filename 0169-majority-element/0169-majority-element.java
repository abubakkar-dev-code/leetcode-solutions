class Solution {
    public int majorityElement(int[] nums) {
        int count=0,major=0;
        for(int value:nums){
            if(count==0){
                major=value;
            }
            if(value==major){
                count++;
            }
            else{
                count--;
            }
        }
        return major;
    }
}