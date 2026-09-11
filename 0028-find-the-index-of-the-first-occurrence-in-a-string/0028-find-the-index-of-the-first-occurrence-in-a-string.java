class Solution {
    public int strStr(String haystack, String needle) {
      
        int idx=-1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            boolean match=true;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    match=false;
                    break;
                }
                
            }
            if(match){
                idx=i;
                break;
            }
        }
        return idx;
    }
}