class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // ArrayList<String> list=new ArrayList<>();
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        String sort_str=new String(arr);
        String reverse=new StringBuilder(s1).reverse().toString();
        for(int i=0;i<=s2.length()-s1.length();i++){
            int len=s1.length();
            char[] ar=(s2.substring(i,i+len)).toCharArray();
            Arrays.sort(ar);
            // list.add(new String(ar));
            String str=new String(ar);
            if(str.equals(s1) || str.equals(sort_str)){
                return true;
            }
        }
        // return list.contains(s1)|| list.contains(reverse) || list.contains(new String(arr));
        return false;
        
        
    }
}