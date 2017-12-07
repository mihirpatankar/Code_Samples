//nums = [1,2,3,6,8,9,11] target = 3 --> ans = 2
//nums = [1,2,3,6,8,9,11] target = 7 --> ans = 4
//nums = [1,2,3,6,8,9,11] target = 15 --> ans = 7

class Solution{
  public int searchInsert(int[] nums, int target){
    int low=0;
    int high=nums.length-1;
    while(low<=high){
      int mid = low+(high-low)/2;
      if(nums[mid]==target){
        return mid;
      }
      else if(nums[mid]>target){
        high=mid-1;
      }
      else{
        low=mid+1;
      }
    }
    return low;
  }
}
