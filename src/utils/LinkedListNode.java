package utils;

/**
 * Created by surya on 7/6/16.
 */
public class LinkedListNode<T> {


    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    private T element;

    public LinkedListNode getPointer() {
        return pointer;
    }

    public LinkedListNode(T element) {
        this.element = element;
    }

    public void setPointer(LinkedListNode pointer) {
        this.pointer = pointer;
    }

    LinkedListNode pointer;

}