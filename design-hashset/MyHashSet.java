class MyHashSet {
    private Bucket[] buckets;
    private int size;

    public MyHashSet() { // O(769) -> O(1)
        this.size = 769; // Arbitrary prime number, can be adjusted
        this.buckets = new Bucket[this.size];
        for (int i = 0; i < this.size; i++) {
            this.buckets[i] = new Bucket();
        }
    }
    
    public void add(int key) { // O(1)
        int index = hash(key);
        buckets[index].insert(key);
    }
    
    public void remove(int key) { // O(1)
        int index = hash(key);
        buckets[index].delete(key);
    }
    
    public boolean contains(int key) { // O(N)
        int index = hash(key);
        return buckets[index].exists(key);
    }

    private int hash(int key) { // O(1)
        return key % this.size;
    }

    static class Bucket {
        private LinkedList<Integer> bucket;

        public Bucket() { // O(1)
            this.bucket = new LinkedList<Integer>();
        }

        public void insert(Integer key) { // O(N)
            if (!exists(key)) this.bucket.addFirst(key);
        }

        public void delete(Integer key) { // O(1) because we add to index 0 when inserting
            this.bucket.remove(key);
        }

        public boolean exists(Integer key) { // O(N)
            int index = this.bucket.indexOf(key);
            return index != -1;
        }
    }
}
