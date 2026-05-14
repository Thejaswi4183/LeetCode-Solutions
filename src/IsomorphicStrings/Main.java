package IsomorphicStrings;

public class Main {

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.isIsomorphic("egg", "add"));
        // true

        System.out.println(obj.isIsomorphic("foo", "bar"));
        // false

        System.out.println(obj.isIsomorphic("paper", "title"));
        // true
    }
}