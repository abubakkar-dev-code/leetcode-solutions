class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int left = 0, right = ch.length - 1;

        while (left < right) {
            if (ch[left] == 'a' || ch[left] == 'e' || ch[left] == 'i' || ch[left] == 'o' || ch[left] == 'u'
                    || ch[left] == 'A' || ch[left] == 'E' || ch[left] == 'I' || ch[left] == 'O' || ch[left] == 'U') {
                if (ch[right] == 'a' || ch[right] == 'e' || ch[right] == 'i' || ch[right] == 'o' || ch[right] == 'u'
                        || ch[right] == 'A' || ch[right] == 'E' || ch[right] == 'I' || ch[right] == 'O'
                        || ch[right] == 'U') {
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return String.valueOf(ch);
    }
}