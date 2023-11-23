package home.work.lesson8;


import java.util.Collection;

public interface MyList<T>{
    boolean add(T value);

    boolean add(T value ,int index);

    T remove(int index);
    boolean remove(Object value);


    boolean isEmpty();
    boolean contains(Object value);
    int indexOf (Object value);
    boolean addAll(Collection<? extends T> value);

    T set (int index, T value);

    T get(int index);

    int size();

    void vivod();
}
