class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> strS = new HashMap<>();
        HashMap<Character, Integer> strT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (strS.containsKey(s.charAt(i))) {
                strS.merge(s.charAt(i), 1, Integer::sum);
            }
            else {
                strS.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (strT.containsKey(t.charAt(j))) {
                strT.merge(t.charAt(j), 1, Integer::sum);
            }
            else {
                strT.put(t.charAt(j), 1);
            }
        }

        if (strS.equals(strT)) {
            return true;
        }
        else {
            return false;
        }
    }
}