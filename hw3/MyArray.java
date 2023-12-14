import java.util.Iterator;

public class MyArray<E> implements Iterable<E> {
    private E[] array;
    private int size;

    public MyArray(E[] baseArray) {
        this.array = baseArray;
        size = array.length;
    }

    public void addElement(E element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[size] = element;
            array = (E[]) newArray;
        } else {
            array[size] = element;
        }
        size++;
    }

    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
    }

    public int getSize() {
        return size;
    }

    public int getArrayLength() {
        return array.length;
    }

    public void printList() {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    class MyArrayIterator implements Iterator<E> {

        int index;
        E[] iterArray;


        public MyArrayIterator() {
            this.index = 0;
            this.iterArray = array;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            return array[index++];
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayIterator();
    }


    private static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
}