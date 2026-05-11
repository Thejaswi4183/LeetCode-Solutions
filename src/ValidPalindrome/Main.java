package ValidPalindrome;

public class Main {
    public static void main(String[] args) {

        Solution obj = new Solution();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "";

        System.out.println(obj.isPalindrome(s1));
        System.out.println(obj.isPalindrome(s2));
        System.out.println(obj.isPalindrome(s3));
    }
}