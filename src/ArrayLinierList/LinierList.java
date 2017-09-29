package ArrayLinierList;

public interface LinierList {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public int indexOf(Object element);
    public Object remove(int index);
    public void add(int index, Object obj);
    public String toString();
    public void changeLength2D(int index, Object obj);
    public void increaseSize();
    public Object setSize(int newSize);
    public void trimToSize();
}
