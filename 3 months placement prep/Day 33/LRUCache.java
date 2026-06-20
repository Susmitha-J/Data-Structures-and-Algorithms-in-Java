class Node {
    int key;
    int value;

    Node prev;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    HashMap<Integer, Node> map;
    int capacity;
   
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;


    }
    
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertAtMRU(Node node) {
        Node prevMRU = tail.prev;

        prevMRU.next = node;
        node.prev = prevMRU;

        node.next = tail;
        tail.prev = node;
    }


    public int get(int key) {
        Node temp = map.get(key);

        if(temp == null) {
            return -1;
        }
        remove(temp);
        insertAtMRU(temp);
        return temp.value;

    }
    
    public void put(int key, int value) {
       if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertAtMRU(node);
            return;
        }

        if (map.size() == capacity) {
            Node lru = head.next;
            remove(lru);
            map.remove(lru.key);
        }

        Node node = new Node(key, value);

        insertAtMRU(node);
        map.put(key, node);

      
    }


}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */