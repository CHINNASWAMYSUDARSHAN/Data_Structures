class Solution {

    public static int bitonicPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public int compareBitonicSums(int[] nums) {
        int peak = bitonicPoint(nums);
        long ascSum = 0;
        long descSum = 0;
        for (int i = 0; i < peak; i++) {
            ascSum += nums[i];
       }
        for (int i = peak + 1; i < nums.length; i++) {
            descSum += nums[i];
       }
        if (ascSum > descSum) {
            return 0;
        } else if (descSum > ascSum) {
            return 1;
        }

        return -1;
    }
}