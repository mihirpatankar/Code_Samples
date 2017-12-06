//nums = [1,3,5,9] target =8 return [1,2]
class Solution{
  public int[] twoSum(int []nums, int target){
    int result[]=new int[2];
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int i=0;i<nums.length;i++){
      if(map.containsKey(target-nums[i])){
        result[0]=map.get(target-nums[i]);
        result[1]=i;
        break;
      }
      map.add(nums[i],i);
    }
    return result;
  }
}
