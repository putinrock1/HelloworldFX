package utils;

/**
 * Created by surya on 7/6/16.
 */
public abstract class LinkedListQueue <T> implements IQueue{

    LinkedListQueue head;
    LinkedListNode Tail;

    public LinkedListQueue (){
        this.head=null;
        this.Tail=null;
    }
}
