class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) { // O(N * M) where N is the number of List<String> item in items and M is the number of chars in item.get(i)/ruleValue
        int count = 0; // O(1)
        int i = switch (ruleKey) { // O(1)
            case "type" -> 0; // O(1)
            case "color" -> 1; // O(1)
            case "name" -> 2; // O(1)
            default -> -1; // O(1)
        };
        if (i < 0) return count; // O(1)

        for (List<String> item : items) { // O(N)
            if (item.get(i).equals(ruleValue)) count++; // O(M)
        }

        return count; // O(1)
    }
}
