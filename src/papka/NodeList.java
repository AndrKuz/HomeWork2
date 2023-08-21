package papka;

public class NodeList<E> {
    Node first;

    public NodeList() {
        first = null;
    }

    public void insertFirst(E data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    public void deleteFirst() {
        first = first.next;
    }

    void insertLast(E data) {
        if (first == null) {
            insertFirst(data);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(data);
            current.next = newNode;
        }
    }

    void deleteAfter(Node after) {
        Node current = first;
        while (current.data != after.data) {
            current = current.next;
        }
        current.next = current.next.next;
    }
//    Так и не воспользовался им (методом выше).

    void addIn(int index, E data) {
        Node current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    E getIn (int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (E) current.data;
    }

    void inDelNode (int index) {
        Node current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}
