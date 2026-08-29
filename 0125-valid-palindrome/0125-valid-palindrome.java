class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (Character.isLetterOrDigit(s.charAt(left))) {
                if(Character.isLetterOrDigit(s.charAt(right))){
                    if(s.charAt(left)!=s.charAt(right)){
                        return false;
                    }
                    else{
                        left++;
                        right--;
                    }               }
                else{
                    right--;
                }
            }
            else{
                left++;
            }
        }
        return true;
        
    }
}