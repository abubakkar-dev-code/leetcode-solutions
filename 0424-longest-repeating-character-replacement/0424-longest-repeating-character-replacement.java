class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, maxFreq = 0, windowLength = 0, maxWindow = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            windowLength = right - left + 1;
            int characterNeedToBeChanged = windowLength - maxFreq;
            if (characterNeedToBeChanged > k) {
                char ch1 = s.charAt(left);
                map.put(ch1, map.getOrDefault(ch1, 0) - 1);
                left++;
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
            right++;
        }
        return maxWindow;
    }
}