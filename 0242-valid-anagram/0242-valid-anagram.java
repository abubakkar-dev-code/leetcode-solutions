class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch2 : t.toCharArray()) {
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);
        }
        for(char c:map.keySet()){
            if(map.get(c)>0){
                return false;
            }
        }
        return true;
    }
}