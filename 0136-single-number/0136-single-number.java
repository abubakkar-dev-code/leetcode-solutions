class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int singleElement=0;
        if(nums.length==1) return nums[0];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int element : map.keySet()) {
            if (map.get(element) == 1) {
                singleElement= element;
            }
        }
        return singleElement;
    }
}