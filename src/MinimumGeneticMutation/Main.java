package MinimumGeneticMutation;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String startGene = "AACCGGTT";
        String endGene = "AAACGGTA";
        String[] bank = {
                "AACCGGTA",
                "AACCGCTA",
                "AAACGGTA"
        };
        int answer = solution.minMutation(startGene, endGene, bank);
        System.out.println(answer);
    }
}
