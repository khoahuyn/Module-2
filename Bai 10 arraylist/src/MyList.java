
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {

        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) elements[i + 1] = elements[i];
        elements[index] = e;
        size++;
    }

    public void ensureCapacity() {
        if (size >= elements.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            elements = newData;
        }
    }

    public E remove(int index) {
        if (index >= size) return null;
        E e = (E) elements[index];

        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];

        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }


    public MyList<E> clone() {
        MyList<E> clone = new MyList<>();
        for (int i = 0; i < size; i++) {
            clone.add(i, (E) elements[i]);
        }
        return clone;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i]))
                return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public E get(int i) {
        return (E) elements[i];
    }


    public static void main(String[] args) {
        MyList<Integer>test=new MyList<>();
        test.add(3);
        test.add(5);
        test.add(1,6);
        test.remove(2);
        System.out.println(test.size());

    }


}
