class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] sort = s.toCharArray();
        char[] tort = t.toCharArray();
        Arrays.sort(sort);
        Arrays.sort(tort); 
        return Arrays.equals(sort, tort);
    }
}
