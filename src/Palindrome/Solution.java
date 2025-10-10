package Palindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int rev=0,x1=x;
        while(x1!=0)
        {
            int r=x1%10;
            rev=rev*10+r;
            x1=x1/10;
        }
        return rev == x;
    }
}