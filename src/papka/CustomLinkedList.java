package papka;

public class CustomLinkedList<E> {
    private NodeList nodeList;
    private int size = 0;
    public CustomLinkedList() {
        nodeList = new NodeList();
    }
    public void add(E data) {
        nodeList.insertLast(data);
        size++;
    }

    public int size() {
        return size;
    }

    public void add(int index, E data) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        if (index == size) {
            nodeList.insertLast(data);
        } else if (index == 0) {
            nodeList.insertFirst(data);
        } else {
            nodeList.addIn(index, data);
        }
        size++;
    }

    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        return (E) nodeList.getIn(index);
    }

    public void remove(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        if (index == 0) {
            nodeList.deleteFirst();
        } else {
            nodeList.inDelNode(index);
        }
        size--;
    }
}
