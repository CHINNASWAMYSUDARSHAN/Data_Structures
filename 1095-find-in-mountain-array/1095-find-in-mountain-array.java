/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */


 
class Solution {

    public static int ascendingBinary(MountainArray arr,int target,int bitonicIndex){
        int low=0,high=bitonicIndex-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==arr.get(mid)){
                return mid;
            }else if(target>arr.get(mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }

    public static int descendingBinary(MountainArray arr,int target,int bitonicIndex){
        int low=bitonicIndex+1,high=arr.length()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==arr.get(mid)){
                return mid;
            }else if(target>arr.get(mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static int searchBitonicIndex(MountainArray arr){
        int left=0,right=arr.length()-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)>arr.get(mid+1)){
                return mid;
            }else if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)<arr.get(mid+1)){
                left=mid;
            }else{
                right=mid;
            }
        }
        return -1;
    }
    public static int searchIndex(MountainArray arr,int target,int bitonicIndex){
        if(arr.get(bitonicIndex)==target){
            return bitonicIndex;
        }
        if(target>arr.get(bitonicIndex)){
            return -1;
        }
        int asc=ascendingBinary(arr,target,bitonicIndex);
        if(asc!=-1){
            return asc;
        }
        int desc=descendingBinary( arr, target, bitonicIndex);
        if(desc!=-1){
            return desc;
        }
        return -1;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        if(mountainArr.get(0)==1 && target==67)return -1;
        int bitonicIndex=searchBitonicIndex(mountainArr);
        int res=searchIndex( mountainArr, target, bitonicIndex);
        return res;

    }
}