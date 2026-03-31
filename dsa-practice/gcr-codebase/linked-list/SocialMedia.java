
import java.util.*;
public class SocialMedia {
    static class Node {
        int userId, age;
        String name;
        List<Integer> friendIds;
        Node next;

        Node(int id, String name, int age) {
            this.userId = id;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
        }
    }

    Node head = null;

    void addUser(int id, String name, int age) {
        Node newnode = new Node(id, name, age);
        newnode.next = head;
        head = newnode;
    }

    Node findUser(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriendConnection(int id1, int id2) {
        Node usernode1 = findUser(id1);
        Node usernode2 = findUser(id2);
        if (usernode1 != null && usernode2 != null) {
            if (!usernode1.friendIds.contains(id2)) usernode1.friendIds.add(id2);
            if (!usernode2.friendIds.contains(id1)) usernode2.friendIds.add(id1);
        }
    }

    void removeFriendConnection(int id1, int id2) {
        Node usernode1 = findUser(id1);
        Node usernode2 = findUser(id2);
        if (usernode1 != null && usernode2 != null) {
            usernode1.friendIds.remove(Integer.valueOf(id2));
            usernode2.friendIds.remove(Integer.valueOf(id1));
        }
    }

    void findMutualFriends(int id1, int id2) {
        Node usernode1 = findUser(id1);
        Node usernode2 = findUser(id2);
        if (usernode1 == null || usernode2 == null) {
            System.out.println("User(s) not found.");
            return;
        }
        Set<Integer> mutual = new HashSet<>(usernode1.friendIds);
        mutual.retainAll(usernode2.friendIds);
        System.out.println("Mutual friends between " + usernode1.name + " and " + usernode2.name + ": " + mutual);
    }

    void displayFriends(int id) {
        Node usernode = findUser(id);
        if (usernode == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Friends of " + usernode.name + ": " + usernode.friendIds);
    }

    void searchByName(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found user: ID=" + temp.userId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    void searchById(int id) {
        Node newnode = findUser(id);
        if (newnode!= null)
            System.out.println("Found user: " + newnode.name);
        else
            System.out.println("User not found.");
    }

    void countFriends() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 30);
        sm.addUser(3, "Charlie", 28);
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.displayFriends(1);
        sm.displayFriends(2);
        sm.findMutualFriends(2, 3);
        sm.searchByName("Alice");
        sm.countFriends();
    }
}

