package hashmap;
public class CustomHashMap<K, V> {

    // Node class (used for chaining)
    private class Node {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private int capacity = 16;        // bucket size
    private Node[] buckets;

    // Constructor
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new CustomHashMap.Node[capacity];
    }

    // Hash function
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // PUT operation
    public void put(K key, V value) {
        int index = getIndex(key);
        Node head = buckets[index];

        // If key already exists → update
        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        // Insert new node at beginning
        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    // GET operation
    public V get(K key) {
        int index = getIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;   // key not found
    }

    // REMOVE operation
    public void remove(K key) {
        int index = getIndex(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    // MAIN method (testing)
    public static void main(String[] args) {

        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);

        System.out.println(map.get("apple"));   // 10
        System.out.println(map.get("banana"));  // 20

        map.remove("banana");
        System.out.println(map.get("banana"));  // null
    }
}
