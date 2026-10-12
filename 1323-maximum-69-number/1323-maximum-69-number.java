class Solution {
    public int maximum69Number (int num) {
        String n=num+"";
        char[] arr=n.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='6'){
                arr[i]='9';
                break;
            }
        }
        String str=new String(arr);
        return Integer.valueOf(str);
        
    }
}