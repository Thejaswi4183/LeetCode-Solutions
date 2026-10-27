package SmallestNumberInInfiniteSet;

public class Main {
    public static void main(String[] args) {

        SmallestInfiniteSet obj = new SmallestInfiniteSet();

        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());

        obj.addBack(1);

        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());

        obj.addBack(2);

        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
    }
}
