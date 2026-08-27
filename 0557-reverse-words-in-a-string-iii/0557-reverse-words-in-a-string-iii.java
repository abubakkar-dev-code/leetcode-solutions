class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int firstIndex = i;
            while (i < ch.length && ch[i] != ' ') {
                i++;
            }
            int left=firstIndex,right=i-1;
            while(left<right){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        return String.valueOf(ch);
    }
}