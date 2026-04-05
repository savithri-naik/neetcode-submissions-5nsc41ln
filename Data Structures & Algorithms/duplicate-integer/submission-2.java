class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Brute force approach
        /*boolean hasDuplicate = false ;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    hasDuplicate = true;
                    return hasDuplicate;
                }
            }
        }
        return hasDuplicate;*/
        //Better approach --use Sorting
        /*boolean containsDuplicate = false ;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                containsDuplicate = true;
                return containsDuplicate;
            }
        }
        return containsDuplicate;*/
       /* Set<Integer> hashSet = new HashSet<>();
        for (int number : nums) {
            if (hashSet.contains(number)) {
                return true;
            }
            hashSet.add(number);
        }
        return false;*/
        Set<Integer> hashSet = new HashSet<>();
        for (int number : nums) {
            hashSet.add(number);
        }
        return hashSet.size() < nums.length;
    }
}