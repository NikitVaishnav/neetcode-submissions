class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Convert keys to array
        Integer[] keys = map.keySet().toArray(new Integer[0]);

        // Sort according to frequency
        Arrays.sort(keys, (a, b) -> map.get(b) - map.get(a));

        // Store top k elements
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = keys[i];
        }

        return ans;
    }
}
