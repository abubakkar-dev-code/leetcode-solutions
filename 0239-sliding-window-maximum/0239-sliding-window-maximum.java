import java.util.*;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        int resultIndex = 0;

        for (int right = 0; right < nums.length; right++) {

            // Remove indices outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= right - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[right]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(right);

            // Window is ready
            if (right >= k - 1) {
                res[resultIndex] = nums[deque.peekFirst()];
                resultIndex++;
            }
        }

        return res;
    }
}