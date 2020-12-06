class SolutionOneLine {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt(); // O(N*M)
    }
}
