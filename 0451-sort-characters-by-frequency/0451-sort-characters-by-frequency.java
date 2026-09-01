class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }
        Character[] keys = new Character[128];
        for (int i = 0; i < freq.length; i++) {
            keys[i] = (char) (i);
        }
        Arrays.sort(keys, (a, b) -> freq[b] - freq[a]);
        StringBuilder sb = new StringBuilder();
        for (char ch : keys) {
            for (int i = 0; i < freq[ch]; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}