package generics;

public class Queue<E>
{
    private E[] array;
    private int nrOfElements;
    @SuppressWarnings("unchecked")
    public Queue(int initialCapacity)
    {
        if(initialCapacity < 0) throw new IllegalArgumentException();
        array = (E[]) new Object[initialCapacity];
        nrOfElements = 0;
    }
    public Queue()
    {
        this(10);
    }
    public int size()
    {
        return nrOfElements;
    }
    public int getLength()
    {
        return array.length;
    }
    public boolean isEmpty()
    {
        return nrOfElements==0;
    }
    public void enqueue(E element)
    {
        if (nrOfElements >= array.length) 
        {
            resize();
        }
        array[nrOfElements++] = element;
    }
    @SuppressWarnings("unchecked")
    private void resize()
    {
        E[] copy = (E[]) new Object[array.length*2];
        for (int i = 0; i < array.length; i++)
        {
            copy[i] = array[i];
        }
        array = copy;
    }
    public E dequeue()
    {
        E dequeuedElement = array[0];
        for (int i = 0; i < array.length - 1;i++)
        {
            array[i] = array[i+1];
        }
        nrOfElements--;
        return dequeuedElement;
    }
    public Object[] getAll()
    {
        Object[] copy = new Object[nrOfElements];
        System.arraycopy(array, 0, copy, 0, nrOfElements);
        return copy;
    }
    public E[] getAll(E[] arr) {
        if(arr.length < nrOfElements) 
            throw new IllegalArgumentException("Argument array size less than nrOfElements, required minuim size of " + nrOfElements);
        for(int i = 0; i < nrOfElements; i++) {
            arr[i] = this.array[i];
        }
        for(int i = nrOfElements; i < arr.length; i++) {
            arr[i] = null;
        }
        return arr;
    }
    public E peek()
    {
        return array[0];
    }
    @Override
    public String toString()
    {
        String info = "Active elements: [";
        for(int i = 0; i < nrOfElements; i++)
        {
            info += array[i] + ";";
        }
        info+="]";
        return info;
    }

}