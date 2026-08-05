class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq=new int[26];
        int left = 0, right = 0, maxFreq = 0, windowLength = 0, maxWindow = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right)-'A']);
            windowLength = right - left + 1;
            int characterNeedToBeChanged = windowLength - maxFreq;
            if (characterNeedToBeChanged > k) {
                char ch1 = s.charAt(left);
               freq[ch1-'A']--;
                left++;
            }
            maxWindow = Math.max(maxWindow, right - left + 1);
            right++;
        }
        return maxWindow;
    }
}