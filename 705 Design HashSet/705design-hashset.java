class MyHashSet {
    long arr[];

    public MyHashSet() {
         arr = new long[(int)Math.pow(10,6)+1];
         arr[0]=-1;
    }

    public void add(int key) {
        if (contains(key))
            return;
        arr[key] = key;
    }

    public void remove(int key) {
        if (contains(key)) {
            if (key == 0)
                arr[0] = -1;
            else arr[key] = 0;
        }
        return;

    }

    public boolean contains(int key) {
        if (key == 0)
            return !(arr[0] == -1);

        if (arr[key] != 0)
            return true;

        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */