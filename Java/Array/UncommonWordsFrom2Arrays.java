class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1 = s1.split(" ");
        Map<String, Integer> map = new HashMap<>();
        //find word -> frequency pairs for s1
        for (String key : arr1) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        Map<String, Integer> map2 = new HashMap<>();
        String[] arr2 = s2.split(" ");
        //find word -> frequency pairs for s2
        for (String key : arr2) {
            if (map2.containsKey(key)) {
                map2.put(key, map2.get(key) + 1);
            } else {
                map2.put(key, 1);
            }
        }
        //find unique words in s1 and which are not in s2
        List<String> result = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1 && !map2.keySet().contains(key)) {
                result.add(key);
            }
        }
        //find unique words in s2 and which are not in s1
        for (String key : map2.keySet()) {
            if (map2.get(key) == 1 && !map.keySet().contains(key)) {
                result.add(key);
            }
        }
        //convert to array of strings
        String[] res = new String[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
