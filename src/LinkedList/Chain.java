//package LinkedList;
//
//import ArrayLinierList.LinierList;
//
//public class Chain implements LinierList{
//    protected ChainNode firstNode;
//    protected int size;
//    
//    public Chain(int intialCapacity){
//        
//    }
//    public Chain(){
//        this(0);
//    }
//    @Override
//    public boolean isEmpty(){
//        return size == 0;
//    }
//    @Override
//    public int size(){
//        return size;
//    }
//    void checkIndex(int index){
//        if(index < 0 || index >= size)
//            throw new IndexOutOfBoundsException(" index = " + index + " size " + size);
//    }
//    @Override
//    public Object get(int index){
//        checkIndex(index);
//        ChainNode currentNode = firstNode;
//        for(int i = 0; i < index; i++)
//            currentNode = currentNode.next;
//        
//        return currentNode.element;
//    }
//    
//}
