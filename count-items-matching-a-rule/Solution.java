class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int i = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };
        if (i < 0) return count;

        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue)) count++;
        }

        return count;
    }
}
