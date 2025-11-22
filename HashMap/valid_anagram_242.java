package HashMap;

import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            countS.put(c1, countS.getOrDefault(c1, 0) + 1);
            countT.put(c2, countT.getOrDefault(c2, 0) + 1);
        }

        for (char c : countS.keySet()) {
            if (!countT.getOrDefault(c, 0).equals(countS.get(c))){
                return false;
            }
        }

        return true;
    }
}