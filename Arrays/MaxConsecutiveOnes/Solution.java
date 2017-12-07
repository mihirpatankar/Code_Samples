//nums = [1,1,1,0,0,0,1,1] ans = 3
class Solution{
  public int findMaxConsecutiveOnes(int[] nums){
    int maxHere=0;
    int maxTotal=0;
    for(int i=0;i<nums;i++){
      if(nums[i]==1){
        maxHere++;
      }
      else{
        maxTotal=Math.max(maxTotal,maxHere);
        maxHere=0;
      }
    }
    return maxTotal;
  }

}
