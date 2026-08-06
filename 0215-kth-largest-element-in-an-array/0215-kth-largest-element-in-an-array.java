class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int n : nums) {
            pq.add(n);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
        //     int left = 0;
        //     int right = nums.length - 1;
        //     int target = nums.length - k;

        //     return quickSelect(nums, left, right, target);
        // }

        // private static int quickSelect(int[] nums, int left, int right, int target) {

        //     if (left <= right) {

        //         int partitionIndex = partition(nums, left, right);

        //         if (partitionIndex == target) {
        //             return nums[partitionIndex];
        //         } else if (partitionIndex > target) {
        //             return quickSelect(nums, left, partitionIndex - 1, target);
        //         } else {
        //             return quickSelect(nums, partitionIndex + 1, right, target);
        //         }
        //     }

        //     return -1;
        // }

        // private static int partition(int[] nums, int left, int right) {

        //     int pivot = nums[right];
        //     int i = left - 1;

        //     for (int j = left; j < right; j++) {

        //         if (nums[j] < pivot) {
        //             i++;

        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }

        //     int temp = nums[i + 1];
        //     nums[i + 1] = nums[right];
        //     nums[right] = temp;

        //     return i + 1;
        // }
    }
}