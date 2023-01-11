package collections;

import java.util.*;
import java.util.function.Consumer;

public class MyArrayList<E> implements Iterable<E> {
    private int minSize = 10;
    private int size;
    private Object[] array;

    public int size() {
        return size;
    }
    public void add(E value) {
        if (array == null) {
            array = new Object[minSize];
        } else if(size == minSize) {
            minSize += minSize;
            array = Arrays.copyOf(array, minSize);
        }
        array[size] = value;
        size++;
    }

    public Object get(int index) {
        if(index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException(String.format("Выход за пределы списка. Размер списка %s, ожидаемый объект с индексом %s", size, index));
        }
    }

    public void remove(int index) {
        array[index] = null;
        if(index == size-1) {
            size--;
        } else if(index >= 0 && index < size) {
            Object[] newArray = new Object[minSize];
            int j = 0;
            for(int i = 0; i < size; i++) {
                if(array[i] != null) {
                    newArray[j] = array[i];
                    j++;
                }
            }
            Arrays.fill(array, null);
            array = Arrays.copyOf(newArray, minSize);
            size--;
        } else {
            throw new IndexOutOfBoundsException(String.format("Выход за пределы списка. Размер списка %s, удаляемый объект с индексом %s", size, index));
        }
    }

    @Override
    public String toString() {
        if(size == 0) {
            return "{}";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (int i = 0; i < size; i++) {
                if(i == 0)
                    sb.append(array[i].toString());
                else
                    sb.append(", " + array[i].toString());
            }
            sb.append("}");
            return sb.toString();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayList.Itr();
    }

    private class Itr implements Iterator<E> {
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such
        int expectedModCount = size;

        // prevent creating a synthetic constructor
        Itr() {}

        public boolean hasNext() {
            return cursor != size;
        }

        @SuppressWarnings("unchecked")
        public E next() {
            checkForComodification();
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = MyArrayList.this.array;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) elementData[lastRet = i];
        }

        public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();
            checkForComodification();

            try {
                MyArrayList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
                expectedModCount = size;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            final int size = MyArrayList.this.size;
            int i = cursor;
            if (i < size) {
                final Object[] es = array;
                if (i >= es.length)
                    throw new ConcurrentModificationException();
                for (; i < size && size == expectedModCount; i++)
                    action.accept(elementAt(es, i));
                // update once at end to reduce heap write traffic
                cursor = i;
                lastRet = i - 1;
                checkForComodification();
            }
        }

        final void checkForComodification() {
            if (size != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    static <E> E elementAt(Object[] es, int index) {
        return (E) es[index];
    }
}

