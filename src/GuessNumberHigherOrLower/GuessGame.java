package GuessNumberHigherOrLower;

public class GuessGame {

    @SuppressWarnings("FieldCanBeLocal")
    private final int pick = 6;

    public int guess(int num) {
        return Integer.compare(pick, num);
    }
}
