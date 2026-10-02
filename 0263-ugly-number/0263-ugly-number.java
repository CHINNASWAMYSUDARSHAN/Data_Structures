class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        int i = 2;
		while (i<=Math.sqrt(n)) {
			while (n % i == 0) {
				n = n / i;
                if(i>5)return false;
			}
			i++;
		}
          if (n > 1) {
            if (n != 2 && n != 3 && n != 5) {
                return false;
            }
        }
        return true;
    }
}