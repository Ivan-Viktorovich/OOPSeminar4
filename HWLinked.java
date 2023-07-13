package hw4sem;

import java.util.Iterator;

public class HWLinked<E> implements HWList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;
    

    public HWLinked() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }  
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 1;

            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }  
        };
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<>(null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> targ = firstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            targ = getNextElement(targ);
        }
        return targ.getCurrentElement();
    }
    private Node<E> getNextElement(Node<E> current) {
            return current.getNextElement();
    }

    @Override
    public int size() {
        return size;
    }

    

    
    
    
    
}
