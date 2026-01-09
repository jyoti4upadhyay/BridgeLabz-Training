

public class InventoryManage{
    static class Node {
        String itemName;
        int itemId, quantity;
        double price;
        Node next;

        Node(String name, int id, int qty, double price) {
            this.itemName = name;
            this.itemId = id;
            this.quantity = qty;
            this.price = price;
        }
    }

    Node head = null;

    void addAtBeginning(String name, int id, int qty, double price) {
        Node node = new Node(name, id, qty, price);
        node.next = head;
        head = node;
    }

    void addAtEnd(String name, int id, int qty, double price) {
        Node node = new Node(name, id, qty, price);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
    }

    void addAtPosition(int pos, String name, int id, int qty, double price) {
        if (pos == 0) {
            addAtBeginning(name, id, qty, price);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos && temp != null; i++) temp = temp.next;
        if (temp == null) return;
        Node node = new Node(name, id, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    void removeById(int id) {
        if (head == null) return;
        if (head.itemId == id) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.itemId != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    void updateQuantity(int id, int newQty) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    void searchById(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println("Found: " + temp.itemName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void searchByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                System.out.println("Found: " + temp.itemId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void displayTotalInventoryValue() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    void displayAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + " " + temp.itemName + " Qty: " + temp.quantity + " Price: " + temp.price);
            temp = temp.next;
        }
    }

    void sortByName(boolean ascending) {
        head = mergeSort(head, ascending);
    }

    Node mergeSort(Node node, boolean asc) {
        if (node == null || node.next == null) return node;
        Node mid = getMiddle(node);
        Node nextOfMid = mid.next;
        mid.next = null;
        Node left = mergeSort(node, asc);
        Node right = mergeSort(nextOfMid, asc);
        return sortedMerge(left, right, asc);
    }

    Node getMiddle(Node node) {
        if (node == null) return node;
        Node slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node sortedMerge(Node a, Node b, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;
        Node result;
        int cmp = a.itemName.compareToIgnoreCase(b.itemName);
        if ((asc && cmp <= 0) || (!asc && cmp > 0)) {
            result = a;
            result.next = sortedMerge(a.next, b, asc);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, asc);
        }
        return result;
    }

    public static void main(String[] args) {
        InventoryManage ims = new InventoryManage();
        ims.addAtEnd("Pen", 101, 50, 1.5);
        ims.addAtBeginning("Notebook", 102, 20, 3.0);
        ims.addAtPosition(1, "Pencil", 103, 100, 0.5);
        ims.displayAll();
        ims.updateQuantity(103, 120);
        ims.searchByName("Pencil");
        ims.removeById(101);
        ims.displayTotalInventoryValue();
        ims.sortByName(true);
        ims.displayAll();
    }
}
