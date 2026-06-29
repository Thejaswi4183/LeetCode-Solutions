package SimplifyPath;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String path = "/.../a/../b/c/../d/./";
        System.out.println(solution.simplifyPath(path));
    }
}