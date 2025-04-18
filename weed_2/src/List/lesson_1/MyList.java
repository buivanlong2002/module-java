package List.lesson_1;
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    // Constructor mặc định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Constructor truyền vào sức chứa ban đầu
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    // Thêm phần tử vào vị trí chỉ định
    public void add(int index, E element) {
        ensureCapacity(size + 1);
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    // Thêm phần tử vào cuối danh sách
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    // Xóa phần tử tại vị trí index
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removed = (E) elements[index];
        int moveCount = size - index - 1;
        if (moveCount > 0) {
            System.arraycopy(elements, index + 1, elements, index, moveCount);
        }
        elements[--size] = null; // Clear phần tử cuối
        return removed;
    }

    // Trả về số lượng phần tử
    public int size() {
        return size;
    }

    // Clone danh sách
    public MyList<E> clone() {
        MyList<E> newList = new MyList<>(elements.length);
        for (int i = 0; i < size; i++) {
            newList.add((E) elements[i]);
        }
        return newList;
    }

    // Kiểm tra phần tử có tồn tại
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    // Trả về vị trí phần tử, -1 nếu không có
    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }

    // Đảm bảo sức chứa tối thiểu
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(minCapacity, elements.length * 2);
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    // Lấy phần tử tại chỉ số
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    // Xóa toàn bộ phần tử
    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;
        size = 0;
    }
}
