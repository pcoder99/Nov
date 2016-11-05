PS:
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


Thought:
  Using datastructure as a helper
 
Implementation:
  public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0){
            return new int[2];
        }
        HashMap<Integer, Integer> cache = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(cache.containsKey(target - nums[i])){
                return new int[]{i, cache.get(target - nums[i])};
            }
            cache.put(nums[i], i);
        }
        
        return new int[]{0,0};
    }
  
