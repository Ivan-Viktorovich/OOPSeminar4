package hw4sem;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HWList<Integer> intLinked = new HWLinked<>();
        intLinked.addFirst(1563563);
        intLinked.addFirst(2);
        intLinked.addFirst(3);
        intLinked.addFirst(4);
        intLinked.addFirst(5);
        intLinked.addLast(7);
        System.out.println("По данному индексу располагается: " + intLinked.getElementByIndex(3));
        // for (Integer s : intLinked) {
        //     System.out.println(s);
        // }
        Iterator<Integer> iterator = intLinked.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------------------");
        Iterator<Integer> deiterator = intLinked.descendingIterator();
        while (deiterator.hasNext()){
            System.out.println(deiterator.next());
        }
        
        
    }
}
