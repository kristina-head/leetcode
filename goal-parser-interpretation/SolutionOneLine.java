class SolutionOneLine {
    public String interpret(String command) { // O(N)
        return command.replace("()", "o").replace("(al)", "al"); // O(N + N)
    }
}
