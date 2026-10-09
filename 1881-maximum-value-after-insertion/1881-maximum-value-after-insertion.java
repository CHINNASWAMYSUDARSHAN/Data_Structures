class Solution {
    public String maxValue(String n, int x) {
       boolean isNegative=(n.charAt(0)=='-');
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);;
            if(!isNegative&& ch-48<x || isNegative && ch-48>x){
                return n.substring(0,i)+x+n.substring(i);
            }
        }
        return n+x;
        
    }
}