package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

/**
 * Created by surya on 7/5/16.
 */
public class UserIO {
    public static void writeUsers(LinkedList<User> users ) throws IOException{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("users.dat"));
        output.writeObject(users);

    }
    public static Object readUsers() throws IOException, ClassNotFoundException {
        Object obj = new Object();
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("users.dat"));
        return input.readObject();
    }
}
