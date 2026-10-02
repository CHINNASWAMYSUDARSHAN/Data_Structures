class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String str="";
        for(int i=arr.length-1;i>=0;i--){
	            if(arr[i].isEmpty()) {
	            	continue;
	            }
	            else {
	            	str+=arr[i];
	            	str+=" ";
	            }
	        }
        return str.trim();
        
    }
}