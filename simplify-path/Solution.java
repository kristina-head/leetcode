class Solution {
    public String simplifyPath(String path) { // O(N + M) where N is the length of the path and M is the length of the pathArray
        String[] pathArray = path.split("/"); // O(N)
        Deque<String> deque = new ArrayDeque<>(pathArray.length); // O(1)
        
        for (String s : pathArray) { // O(M)
            if (s.equals(".") || s.equals("")) { // O(1)
                continue; // O(1)
            } else if (s.equals("..")) { // O(1)
                if (!deque.isEmpty()) deque.removeLast(); // O(1)
            } else {
                deque.addLast(s); // O(1)
            }
        }

        StringBuilder sb = new StringBuilder(); // O(1)

        if (deque.isEmpty()) { // O(1)
            sb.append("/"); // O(1)
        } else {
            while (!deque.isEmpty()) { // O(M) worst case
                sb.append("/"); // O(1)
                sb.append(deque.removeFirst()); // O(1)
            }
        }

        return sb.toString(); // O(M) worst case
    }
}
