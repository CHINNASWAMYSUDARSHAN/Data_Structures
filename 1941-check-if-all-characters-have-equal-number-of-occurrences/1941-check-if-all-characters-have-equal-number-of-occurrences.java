class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int count=1;
            if(map.containsKey(ch)){
                count=map.get(ch);
                map.put(ch,count+1);
            }
            else{
                map.put(ch,count);
            }
        }
        int occurence=map.get(s.charAt(0));
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()!=occurence){
                return false;
            }
        }
        return true;
        
    }
}