class Solution {
    public String reverseOnlyLetters(String s) {
        char [] ch=s.toCharArray();
        int left=0,right=ch.length-1;
        while(left<right){
            if(Character.isLetter(ch[left])){
                if(Character.isLetter(ch[right])){
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
        String sb=new String(ch);
        return sb;
    }
}