class Node {
    int key;
    int value;
    int freq;

    Node prev;
    Node next;
    
    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.freq = 1;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    DoublyLinkedList() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    void addLast(Node node) {
        node.prev = tail.prev;
        node.next = tail;

        tail.prev.next = node;
        tail.prev = node;

        size++;
    }

    void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

        size--;
    }

    Node removeFirst() {
        if (size == 0) {
            return null;
        }

        Node node = head.next;
        remove(node);

        return node;
    }
}

class LFUCache {
    
    private final int capacity;
    private int size;
    private int minFreq;

    private final Map<Integer, Node> keyMap;
    private final Map<Integer, DoublyLinkedList> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.minFreq = 0;

        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
    }

    
    
    public int get(int key) {
        Node node = keyMap.get(key);

        if (node == null) {
            return -1;
        }

        updateFrequency(node);

        return node.value;

        
    }
    
    public void put(int key, int value) {
                if (capacity == 0) {
            return;
        }

        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);

            node.value = value;
            updateFrequency(node);

            return;
        }

        if (size == capacity) {
            DoublyLinkedList minList = freqMap.get(minFreq);

            Node nodeToRemove = minList.removeFirst();

            keyMap.remove(nodeToRemove.key);

            size--;
        }

        Node newNode = new Node(key, value);

        keyMap.put(key, newNode);

        freqMap.computeIfAbsent(1, k -> new DoublyLinkedList())
               .addLast(newNode);

        minFreq = 1;
        size++;
        
    }

    private void updateFrequency(Node node) {
        int oldFreq = node.freq;

        DoublyLinkedList oldList = freqMap.get(oldFreq);
        oldList.remove(node);

        if (oldFreq == minFreq && oldList.size == 0) {
            minFreq++;
        }

        node.freq++;

        freqMap.computeIfAbsent(node.freq, k -> new DoublyLinkedList())
               .addLast(node);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */