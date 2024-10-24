// IMPORTANT PROBLEM
// Trapping Rainwater Problem states that given an array of n non-negative integers arr [] representing an elevation map where the width of each bar is 1, compute how much water it can trap after rain


public class trappingRainwater {
    public static int trappedRainwater(int height[]){
        int n = height.length;
        //Calculate leftmax Boundary
        int leftMax[]=new int [n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //Calculate Rightmax Boundary

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater = 0;
        //loop
        for(int i=0; i<n; i++){
            //waterLevel = min(leftmax bound,rightmax bound)
            int waterLevel=Math.min(leftMax[i], rightmax[i]);
             //trapped water = watwrlwvel = height[i]
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;

    } 
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped Rainwater amount is : "+trappedRainwater(height));
        
    }    
}
