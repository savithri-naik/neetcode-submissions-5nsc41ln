class Solution {
    public boolean isAnagram(String s, String t) {
        //using sorting
        //Time complexity: O(nlogn + mlogn)
        //Space complexity: O(1) or O(n+m)
        /*if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);*/

        //Using Hashmap
        //Time Complexity : O(n+m)
        //Space Complexity : O(1)
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i) , countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i) , countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
        //using Array characterCount 
        //Time complexity : O(m+n)
        //Space complexity : O(1) since we have atmost 26 characeters
        /*if (s.length() != t.length()) {
            return false;
        }
        int[] characterCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            characterCount[s.charAt(i) - 'a']++;
            characterCount[t.charAt(i) - 'a']--;

        }
        for (int value : characterCount) {
            if (value != 0) {
                return false;
            }
        }
        return true;*/

    }
}
