class Solution {
    public int trap(int[] height) {
       int res=0;
		int lb[]=new int[height.length];
		int rb[]=new  int[height.length];
		lb[0]=height[0];
		for(int i=1;i<height.length;i++) {
			lb[i]=Math.max(height[i], lb[i-1]);
		}
		rb[height.length-1]=height[height.length-1];
		for(int i=height.length-2;i>=0;i--) {
			rb[i]=Math.max(height[i], rb[i+1]);
		}
		
		for(int i=1;i<height.length-1;i++) {
			int wl=Math.min(rb[i], lb[i]);
			int tw=wl-height[i];
			res+=tw;
		} 
        return res;
    }
}