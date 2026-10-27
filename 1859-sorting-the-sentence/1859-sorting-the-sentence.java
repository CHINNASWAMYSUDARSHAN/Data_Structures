class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String res[]=new String[arr.length+1];
        for(int i=0;i<arr.length;i++){
            int index=arr[i].charAt(arr[i].length()-1)-48;
            res[index]=arr[i].substring(0, arr[i].length()-1);
        }
        String ans="";
        for(int i=1;i<res.length;i++) {
        		ans+=res[i]+" ";
        }
        
        return ans.trim();
    }
}