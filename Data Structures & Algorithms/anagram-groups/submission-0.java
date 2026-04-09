class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Using Hashmap
        /*Map<String, List<String>> result = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            result.putIfAbsent(sortedKey, new ArrayList<>());
            result.get(sortedKey).add(s);
        }
        return new ArrayList<>(result.values());*/

        Map<String, List<String>> result = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String countKey = Arrays.toString(count);
            result.putIfAbsent(countKey, new ArrayList<>());
            result.get(countKey).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
