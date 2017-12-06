//nums = [1,1,2,2,2,3,3] return 3 with first three elements of array being [1,2,3]
class Solution{
  public int removeDup(int[] nums){
      HashSet<Integer> hs = new LinkedHashSet<Integer>();
      for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
      }
      int index=0;
      for(int element:hs){
        nums[index++]=element;
      }
      return hs.size();
  }

  public int removeDupNoExtraMemory(int[] nums){
    if(nums.length==0){
      return 0;
    }
    int i=0;
    for(j=0;j<nums.length;j++){
      if(nums[i]!=nums[j]){
        i++;
        nums[i]=nums[j];
      }
    }
    return i+1;
  }
}
