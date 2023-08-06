class Logger {
    private Map<String, Integer> messages;

    public Logger() { // O(1)
        this.messages = new HashMap<>();
    }
    
    /**
     * Returns true if the message has not been printed in the last 10 seconds.
     */
    public boolean shouldPrintMessage(int timestamp, String message) { // O(1)
        if (messages.containsKey(message)) {
            if (timestamp < messages.get(message) + 10) return false;
        }
        
        messages.put(message, timestamp);
        
        return true;
    }
}
