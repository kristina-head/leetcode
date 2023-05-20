class MyHashSet {
    private Bucket[] buckets;
    private int size;

    public MyHashSet() {
        this.size = 769; // Arbitrary prime number, can be adjusted
        this.buckets = new Bucket[this.size];
        for (int i = 0; i < this.size; i++) {
            this.buckets[i] = new Bucket();
        }
    }
    
    public void add(int key) {
        int index = hash(key);
        buckets[index].insert(key);
    }
    
    public void remove(int key) {
        int index = hash(key);
        buckets[index].delete(key);
    }
    
    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index].exists(key);
    }

    private int hash(int key) {
        return key % this.size;
    }

    static class Bucket {
        private LinkedList<Integer> bucket;

        public Bucket() {
            this.bucket = new LinkedList<Integer>();
        }

        public void insert(Integer key) {
            if (!exists(key)) this.bucket.addFirst(key);
        }

        public void delete(Integer key) {
            this.bucket.remove(key);
        }

        public boolean exists(Integer key) {
            int index = this.bucket.indexOf(key);
            return index != -1;
        }
    }
}
