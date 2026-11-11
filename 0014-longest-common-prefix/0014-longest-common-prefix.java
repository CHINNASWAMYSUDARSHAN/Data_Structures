class Solution {
    public String longestCommonPrefix(String[] strs) {
        String min_str=strs[0];
        int min_len=strs[0].length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min_len){
                min_str=strs[i];
                min_len=strs[i].length();
            }
        }

        String res="";
        for(int i=0;i<min_len;i++){
            char ch=min_str.charAt(i);
            boolean same=true;
            for(int j=0;j<strs.length;j++){
                if(ch!=strs[j].charAt(i)){
                    same=false;
                    return res;
                }
            }
            if(same){
                res+=ch;
            }
        }
        return res.trim();
    }
}