
public class UndoRedo {
    static class Node{
        String content;
        Node next, prev;

        Node(String content) {
            this.content = content;
        }
    }

    Node curr = null;
    int maxHistory = 10;
    int size = 0;

    void addState(String text) {
        Node newnode = new Node(text);
        if (curr != null) {
            curr.next = newnode;
            newnode.prev = curr;
        }
        curr = newnode;
        size++;
        trimHistory();
    }

    void undo() {
        if (curr != null && curr.prev != null) {
            curr = curr.prev;
            System.out.println("Undo: " + curr.content);
        } else {
            System.out.println("No more undo possible.");
        }
    }

    void redo() {
        if (curr != null && curr.next != null) {
            curr = curr.next;
            System.out.println("Redo: " + curr.content);
        } else {
            System.out.println("No more redo possible.");
        }
    }

    void displayCurrentState() {
        if (curr != null) {
            System.out.println("Current Text: " + curr .content);
        } else {
            System.out.println("Document is empty.");
        }
    }

    void trimHistory() {
        int count = 0;
        Node temp = curr;
        while (temp != null) {
            count++;
            temp = temp.prev;
        }
        if (count > maxHistory) {
            Node oldest = curr;
            while (count > maxHistory) {
                oldest = oldest.prev;
                count--;
            }
            if (oldest.prev != null) {
                oldest.prev.next = null;
                oldest.prev = null;
            }
        }
    }

    public static void main(String[] args) {
        UndoRedo editor = new UndoRedo();
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!!!");
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();
    }
}
