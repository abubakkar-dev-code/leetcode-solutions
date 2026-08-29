class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }
            if (i >= n)
                break;
            int firstIndex=i;
            while (i< n && s.charAt(i) != ' ') {
                i++;
            }
            String sub = s.substring(firstIndex, i);
            if (sb.length() == 0) {
                sb.append(sub);
            } else {
                sb.insert(0, sub + " ");
            }
        }
        return String.valueOf(sb);
    }
}