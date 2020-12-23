import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity() {
        int minCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public E remove(int index) {
        Object[] temp = new Object[elements.length + 1];
        for (int i = 0; i < elements.length; ++i) {
            if (i < index) temp[i] = elements[i];
            if (i > index) temp[i - 1] = elements[i];

        }
        elements = temp;
        return (E) elements;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }


    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o))
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < this.size; i++) {
            result += this.elements[i];
            if (i < this.size -1) result += ", ";

        }
        return result + "]";
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;
        size = 0;
    }
}
