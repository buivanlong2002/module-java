package List.lesson_2;

public class MyLinkedList<E> {
    Node head = null;
    int numNodes = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return data;
        }
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        } else if (index == 0) {
            addFirst(element);
            return;
        } else if (index == numNodes) {
            addLast(element);
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
            numNodes++;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            numNodes++;
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
            numNodes--;
        }
    }

    public void removeLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        numNodes--;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        if (index == 0) {
            E data = (E) head.data;
            removeFirst();
            return data;
        } else if (index == numNodes - 1) {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            E data = (E) current.next.data;
            removeLast();
            return data;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node nodeToRemove = temp.next;
            temp.next = nodeToRemove.next;
            numNodes--;
            return (E) nodeToRemove.data;
        }
    }

    public boolean remove(Object e) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(e)) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        if (head == null) {
            return -1;
        }
        Node current = head;
        for (int i = 0; i < numNodes; i++) {
            if (current.next.data.equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (E) current.data;
    }

    public E getFirst() {
        if (head == null) return null;
        return (E) head.data;
    }
    public E getLast() {
        if (head == null) return null;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return (E) current.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<>();
        Node current = head;
        while (current != null) {
            clonedList.add((E) current.data);
            current = current.next;
        }
        return clonedList;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


}