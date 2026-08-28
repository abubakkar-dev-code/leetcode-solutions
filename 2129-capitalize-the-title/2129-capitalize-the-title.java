class Solution {
    public String capitalizeTitle(String title) {
        char   ch[]=title.toCharArray();
        for(int i=0;i<ch.length;i++){
            int firstIdx=i;
            while(i<ch.length&&ch[i]!=' '){
                ch[i]=Character.toLowerCase(ch[i]);
                i++;
            }
            if(i-firstIdx>2){
                ch[firstIdx]=Character.toUpperCase(ch[firstIdx]);
            }
        }
        return String.valueOf(ch);
    }
}