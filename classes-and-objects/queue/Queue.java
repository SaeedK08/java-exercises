package queue;

public class Queue
{
    private String[] texts;
    private int nrOfElements;
    Queue(int size)
    {
        texts = new String[size];
        nrOfElements = 0;
    }
    Queue()
    {
        this(10);
    }
    int getSize()
    {
        return nrOfElements;
    }
    int getLength()
    {
        return texts.length;
    }
    boolean isEmpty()
    {
        return nrOfElements==0 ? true : false;
    }
    void enqueue(String text)
    {
        if (nrOfElements >= texts.length) 
        {
            resize();
        }
        texts[nrOfElements++] = text;
    }
    void resize()
    {
        String[] copy = new String[texts.length*2];
        for (int i = 0; i < texts.length; i++)
        {
            copy[i] = texts[i];
        }
        texts = copy;
    }
    String dequeue()
    {
        String dequeuedElement = texts[0];
        for (int i = 0; i < texts.length - 1;i++)
        {
            texts[i] = texts[i+1];
        }
        nrOfElements--;
        return dequeuedElement;
    }
    String[] getAll()
    {
        String[] copy = new String[nrOfElements];
        System.arraycopy(texts, 0, copy, 0, nrOfElements);
        return copy;
    }
    String peek()
    {
        return texts[0];
    }
    @Override
    public String toString()
    {
        String info = "Active elements: [";
        for(int i = 0; i < nrOfElements; i++)
        {
            info += texts[i] + ";";
        }
        info+="]";
        return info;
    }
}