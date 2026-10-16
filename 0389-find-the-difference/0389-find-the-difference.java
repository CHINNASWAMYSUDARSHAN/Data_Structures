class Solution {
    public char findTheDifference(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int min = a.length < b.length ? a.length : b.length;
        for (int i = 0; i < min; i++) {
            if (a[i] != b[i]) {
                return b[i];
            }
        }
        return b[b.length - 1];
    }
}