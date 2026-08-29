class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int left=0,right=s.length()-1;

        while(left<right){
            if(Character.isLetter(ch[left])){
                if(Character.isLetter(s.charAt(right))){
                    char temp=ch[left];
                   ch[left]=ch[right];
                   ch[right]=temp;
                   left++;
                   right--;
                }
                else{
                    right--;
                }
            }
            else{
                left++;

            }
        }
        return String.valueOf(ch);
    }
}