package hw4sem;

public interface HWList<E> extends Iterable<E>, DescendingIterator<E>{
    void addFirst(E e);
    void addLast(E e);
    E getElementByIndex(int counter);
    int size();
}
