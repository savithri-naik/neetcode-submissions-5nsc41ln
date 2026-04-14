class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Time Complexity: O(nlogn)
        //Space complexty: O(n)
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num , 0) + 1);
        }
        List<int[]> elementsArray = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry: count.entrySet()) {
            elementsArray.add(new int[] {entry.getValue() , entry.getKey()});
        }
        Collections.sort(elementsArray, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return b[0] - a[0];
            }});
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = elementsArray.get(i)[1];
        }
        return result;
    }
}
