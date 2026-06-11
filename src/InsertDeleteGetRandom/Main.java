package InsertDeleteGetRandom;

public class Main {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));  // true
        System.out.println(obj.remove(2)); // false
        System.out.println(obj.insert(2)); // true
        System.out.println(obj.getRandom());   // 1 or 2 (random)
        System.out.println(obj.remove(1)); // true
        System.out.println(obj.insert(2)); // false
        System.out.println(obj.getRandom());  // 2 (only element left)
    }
}