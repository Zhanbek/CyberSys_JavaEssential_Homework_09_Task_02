import java.util.Arrays;

public class MyList<T> {
    private int capacity;
    private int size;

    T[] array;

    public MyList() {
        this(10);
    }

    public MyList(int initialCapacity) {
        capacity = initialCapacity;
        size = 0;
        array = (T[]) new Object[capacity];
    }

    public void add(T item) {
        if (size == capacity) {
            capacity = capacity * 2 + 1;
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size++] = item;
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Вихід індексу " +  + index + " за межі списку [0, " + size + "]");
        }
    }

    public int getIndexByValue(T value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(array[i])) return i;
        }
        return -1;
    }

    public T getValueByIndex(int index) {
        checkBounds(index);
        return array[index];
    }

    public void setValueByIndex(int index, T item) {
        checkBounds(index);
        array[index] = item;
    }

    public void removeByIndex(int index) {
        checkBounds(index);
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        T[] newArray = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(array[i]).append("\n");
        }
        return sb.toString();
    }
}
