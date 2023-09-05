class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        // Initialize hash map
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate arr to find frequency
        for (int i : arr)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Store the frequency count of elements in the unordered set.
        Set<Integer> freqSet = new HashSet<>(map.values());

        // If the set size is equal to the map size, 
        // It implies frequency counts are unique.
        return map.size() == freqSet.size();
    }
}
