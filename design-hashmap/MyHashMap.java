class MyHashMap {
    private Bucket[] buckets;
    private int size;

    public MyHashMap() {
        this.size = 2069; // Arbitrary prime number
        this.buckets = new Bucket[this.size];
        for (int i = 0; i < this.size; i++) {
            this.buckets[i] = new Bucket();
        }
    }
    
    public int get(int key) {
        int index = hash(key);
        return this.buckets[index].select(key);
    }

    public void put(int key, int value) {
        int index = hash(key);
        this.buckets[index].update(key, value);
    }
    
    public void remove(int key) {
        int index = hash(key);
        this.buckets[index].delete(key);
    }

    private int hash(int key) {
        return key % this.size;
    }

    static class Bucket {
        private LinkedList<Pair<Integer, Integer>> bucket;

        public Bucket() {
            this.bucket = new LinkedList<Pair<Integer, Integer>>();
        }

        public Integer select(Integer key) {
            for (Pair<Integer, Integer> pair : this.bucket) {
                if (pair.key.equals(key)) return pair.value;
            }
            return -1;
        }

        public void update(Integer key, Integer value) {
            boolean found = false;
            for (Pair<Integer, Integer> pair : this.bucket) {
                if (pair.key.equals(key)) {
                    pair.value = value;
                    found = true;
                }
            }
            if (!found) this.bucket.add(new Pair(key, value));
        }

        public void delete(Integer key) {
            for (Pair<Integer, Integer> pair : this.bucket) {
                if (pair.key.equals(key)) {
                    this.bucket.remove(pair);
                    break;
                }
            }
        }
    }

    static class Pair<K, V> {
        public K key;
        public V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
