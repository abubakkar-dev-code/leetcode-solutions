class Solution {
    public String minWindow(String s, String t) {
        int [] windowFreq=new int[128];
        int [] tFreq=new int[128];

        for(char ch:t.toCharArray()){
            tFreq[ch]++;
        }
        int left=0,minLength=Integer.MAX_VALUE,start=0;

        for(int right=0;right<s.length();right++){
            windowFreq[s.charAt(right)]++;

            while(containsAll(windowFreq,tFreq)){
                int currentLength=right-left+1;
                if(currentLength<minLength){
                    minLength=currentLength;
                    start=left;
                }
                windowFreq[s.charAt(left)]--;
                left++;
            }
        }
            return minLength==Integer.MAX_VALUE?"":s.substring(start,start+minLength);
    }
    private static boolean containsAll(int[] windowFreq,int[] tFreq){
        for(int i=0;i<128;i++){
            if(windowFreq[i]<tFreq[i]){
                return false;
            }
        }
        return true;
    }
}