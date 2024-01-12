class Solution {
    public boolean rotateString(String s, String goal) {
        String b = s;
        String c = goal;
        ;
        if (b.length() == c.length()) {
            String t = b + b; // concatee string
            if (t.contains(c)) // contains function use check goal string in t
                return true;
        }
        return false;
    }
}