//nums = [3,3,3,3,3,2,2,2] return 2 with first two elements of array being [2,2]
class Solution{
  public int removeElement(int[] nums, int removeElement){
    if(nums.length==0){
      return 0;
    }
    int slow=0;
    for(int fast=0;fast<nums.length;fast++){
      if(nums[fast]!=removeElement){
        nums[slow]=nums[fast];
        slow++;
      }
    }
    return slow;
  }
}
