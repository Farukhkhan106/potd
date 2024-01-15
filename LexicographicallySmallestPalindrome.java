class Solution {
    public String makeSmallestPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        StringBuilder n=new StringBuilder(s);
        while(start<=end)
        {
            if(s.charAt(start)>s.charAt(end))
            n.setCharAt(start,s.charAt(end));
             else if(s.charAt(start)<s.charAt(end))
            n.setCharAt(end,s.charAt(start));
            start++;
            end--;
        }
        return n.toString();
        
    }
}