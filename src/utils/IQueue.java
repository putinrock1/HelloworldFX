package utils;

/**
 * Created by surya on 7/6/16.
 */
public interface IQueue<T> {
    public void enqueue (T element);
    public void dequeue();
    public boolean IsEmpty();
}
