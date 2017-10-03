package ArrayLinierList;

public class ArrayLinierList implements LinierList {
    protected Object [] element , element2;
    protected int size;
    protected int capacity;
    int index, count;

     public ArrayLinierList (int initialCapacity){
        if(initialCapacity < 1){
            System.out.println("Salah !");
            throw new IllegalArgumentException("panjang array harus lebih dari 1");
        }
        
        element = new Object[initialCapacity];
        
        if(initialCapacity == element.length){
        element = ChangeArrayLength.changeLength1D(element, 2*initialCapacity);
        }
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
    @Override
    public Object remove(int index){
        checkIndex(index);
        Object removeElement = element[index];
        for(int i = index + 1; i < size; i++)
            element[i-1] = element [i];
        element[--size] = null;
        return removeElement;
    }
    @Override
    public void add(int index, Object theElement){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index = " +index+ "size ="+ size);
        }
        if(size == element.length){
            ArrayLinierList x = new ArrayLinierList(size);
        }
        if(element.length > size){
        for(int i = size -1; i >= index; i--){
                element[i+1] = element[i];
        }
        element[index] = theElement;
        size++;
        }
    }
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        for(int i = 0; i< size; i++)
            if (element[i] == null)
                s.append("null, ");
            else
                s.append(element[i].toString() + ", ");
        
        if (size > 0)
            s.delete(s.length() -2, s.length());
        
        s.append("]");
        
        return new String(s);
    }
    @Override
    public void increaseSize(){
        capacity++;
        Object[] newArray = new Object[capacity];
        System.arraycopy(element, 0, newArray, 0, element.length);
        element = newArray;
    }
    @Override
    public void trimToSize(){
        if (size < capacity) {
            Object[] newArray = new Object[size];
            System.arraycopy(element, 0, newArray, 0, size);
            element = newArray;
            capacity = size;
        }
    }
    @Override
    public Object setSize(int newSize){
        if(size > newSize){
            int index = size - newSize;
            Object removeElement = element[index];
            for(int j=0; j<index; j++){
                for(int i = index + 1; i < size; i++){
                    element[i-1] = element[i];
                }
                element[--size] = null;
            }
            return removeElement;
        }
        else{
            element2 = new Object[newSize];
            System.arraycopy(element, 0, element2,0, size);
            element = element2;
        }
        return size;
    }
    @Override
    public void changeLength2D(int index, Object obj){
        if(size <= capacity){
            
        }
    }
     @Override
    public Object clear(){
        for(int i = 0; i<size; i++){
            element[i] = null;
        }
        return element;
    }
    @Override
    public void removeRange(int fromIndex, int toIndex){
        count++;
        int numMove = size - toIndex;
        System.arraycopy(element, toIndex, element, fromIndex, numMove);
        int newSize = size - (toIndex - fromIndex);
        while(size != newSize){
            element[--size] = null;
        }
    }
    @Override
    public Object clone(Object[] a){
        a = new Object[size];
        a = element.clone();
        return toString();
    }
}
