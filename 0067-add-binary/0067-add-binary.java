class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1,j=b.length()-1,carry=0;
        while(i>=0||j>=0||carry>0){
            int num1=i>=0?a.charAt(i)-'0':0;
            int num2=j>=0?b.charAt(j)-'0':0;
            int c=num1+num2+carry;
            int sum=c%2;
            carry=c/2;
            sb.insert(0,sum);
            i--;
            j--;
        }
        return sb.toString();
    }
}