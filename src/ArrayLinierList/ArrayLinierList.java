package ArrayLinierList;

public class ArrayLinierList implements LinierList {
    protected Object [] element , element2;
    protected int size;
    protected int capacity;
    int index;

    public ArrayLinierList(int capacity){
        this.capacity = capacity;
        element = new Object[capacity];
        index = 0;
    }
    public ArrayLinierList(){
        this(10);
    }
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    @Override
    public int size(){
        return size;
    }
    void checkIndex(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException(" index = " + index + " size = " + size);
    }
    @Override
    public Object get(int index){
        checkIndex(index);
        return element[index];
    }
    @Override
    public int indexOf(Object elem){
        for(int i = 0; i < size; i++)
            if(element [i].equals(element2))
                return i;
        
        return -1;
    }
    public 
    
}
