class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // sum=0 occurs once (for subarray starting at index 0)
        
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            
            // check if there's a prefix sum that makes subarray = k
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            // store/update current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
