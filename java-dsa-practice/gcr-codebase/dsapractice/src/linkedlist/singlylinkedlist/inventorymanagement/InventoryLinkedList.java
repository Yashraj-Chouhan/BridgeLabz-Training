package linkedlist.singlylinkedlist.inventorymanagement;

public class InventoryLinkedList {

    private ItemNode head;

    // Add at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove item by ID
    public void removeByItemId(int id) {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed successfully");
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item removed successfully");
        }
    }

    // Update quantity by ID
    public void updateQuantity(int id, int newQty) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item ID
    public void searchByItemId(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item Name
    public void searchByItemName(String name) {
        ItemNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found");
        }
    }

    // Calculate total inventory value
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = ₹" + total);
    }

    // Sort by Item Name
    public void sortByName(boolean ascending) {
        head = mergeSort(head, ascending, true);
        System.out.println("Inventory sorted by name");
    }

    // Sort by Price
    public void sortByPrice(boolean ascending) {
        head = mergeSort(head, ascending, false);
        System.out.println("Inventory sorted by price");
    }

    // Display inventory
    public void display() {
        if (head == null) {
            System.out.println("Inventory is empty");
            return;
        }

        ItemNode temp = head;
        System.out.println("\nID | Name | Qty | Price");

        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    // ================= Merge Sort Logic =================

    private ItemNode mergeSort(ItemNode node, boolean asc, boolean byName) {
        if (node == null || node.next == null)
            return node;

        ItemNode mid = getMiddle(node);
        ItemNode nextOfMid = mid.next;
        mid.next = null;

        ItemNode left = mergeSort(node, asc, byName);
        ItemNode right = mergeSort(nextOfMid, asc, byName);

        return sortedMerge(left, right, asc, byName);
    }

    private ItemNode sortedMerge(ItemNode a, ItemNode b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName) {
            condition = asc ?
                    a.itemName.compareToIgnoreCase(b.itemName) <= 0 :
                    a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }

        ItemNode result;
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, asc, byName);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, asc, byName);
        }
        return result;
    }

    private ItemNode getMiddle(ItemNode node) {
        ItemNode slow = node, fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private void printItem(ItemNode i) {
        System.out.println(
                i.itemId + " | " +
                i.itemName + " | " +
                i.quantity + " | ₹" + i.price
        );
    }
}

