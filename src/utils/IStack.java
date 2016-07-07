package utils;

/**
 * Created by surya on 7/6/16.
 */
public interface IStack<T> {
    public T top();
    public T pop();
    public void push (T element);

    public boolean IsEmpty();
}
