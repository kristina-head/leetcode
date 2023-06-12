class Solution {
    public String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        Deque<String> deque = new ArrayDeque<>(pathArray.length);
        
        for (String s : pathArray) {
            if (s.equals(".") || s.equals("")) {
                continue;
            } else if (s.equals("..")) {
                if (!deque.isEmpty()) deque.removeLast();
            } else {
                deque.addLast(s);
            }
        }

        StringBuilder sb = new StringBuilder();

        if (deque.isEmpty()) {
            sb.append("/");
        } else {
            while (!deque.isEmpty()) {
                sb.append("/");
                sb.append(deque.removeFirst());
            }
        }

        return sb.toString();
    }
}
