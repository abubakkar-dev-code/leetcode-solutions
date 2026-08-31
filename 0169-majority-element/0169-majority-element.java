class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int count:map.keySet()){
            if(map.get(count)>nums.length/2){
                return count;
            }
        }
        return -1;
    }
}