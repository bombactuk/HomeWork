package home.work.lesson8;

import java.util.Collection;

public class MyArrayList<T> implements MyList<T> {

    private T[] values;
    private int size = 10;

    MyArrayList() {
        values = (T[]) new Object[size];
    }

    MyArrayList(int capacity) {
        values = (T[]) new Object[capacity];
    }

    MyArrayList(Collection<? extends T> collection) {
    }

    private void increasingTheArray() {
        T[] temporary = (T[]) new Object[values.length * 2];
        System.arraycopy(values, 0, temporary, 0, values.length);
        values = temporary;

    }

    @Override
    public boolean add(T value) {
        if (size >= values.length - 1) {
            increasingTheArray();
        }
        values[size++] = value;
        return true;
    }

    @Override
    public boolean add(T value, int index) {
        if (index > values.length - 1) {
            increasingTheArray();
        }
        values[index] = value;
        return true;

    }

    @Override
    public T remove(int index) {
        if ((index < values.length) && (index >= 0)) {
            T deletedElement = values[index];
            T[] temporary = values;
            values = (T[]) new Object[temporary.length - 1];
            System.arraycopy(temporary, 0, values, 0, index);
            int amoutElementAfterIndex = temporary.length - index - 1;
            System.arraycopy(temporary, index + 1, values, index, amoutElementAfterIndex);
            return deletedElement;
        }
        return null;
    }

    @Override
    public boolean remove(Object value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) {
                T[] temporary = values;
                values = (T[]) new Object[temporary.length - 1];
                System.arraycopy(temporary, 0, values, 0, i);
                int amoutElementAfterIndex = temporary.length - i - 1;
                System.arraycopy(temporary, i + 1, values, i, amoutElementAfterIndex);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object value) {
        return indexOf(value) >= 0;
    }

    @Override
    public int indexOf(Object value) {
        if (value == null) {
            for (int i = 0; i < values.length; i++) {
                if (values[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < values.length; i++) {
                if (value.equals(values[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {
        for (T item : value) {
            add(item);
        }
        return true;
    }

    @Override
    public T set(int index, T value) {
        if ((index < values.length) && (index >= 0)) {
            T temporary = values[index];
            values[index] = value;
            return temporary;
        }
        return null;
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i <= values.length - 1; i++) {
            if (values[i] != null) {
                size++;
            }
        }
        return size;
    }


    @Override
    public void vivod() {
        for (int i = 0; i <= values.length - 1; i++) {
            System.out.println(values[i]);
        }
    }
}
