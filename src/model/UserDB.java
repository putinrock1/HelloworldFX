package model;

import java.util.LinkedList;

/**
 * Created by surya on 7/5/16.
 */
public class UserDB {




        private static LinkedList<User> users = new LinkedList<User>();
    public UserDB(){

    }

        public static LinkedList <User> getUsers() {return users;}
        public static void setUsers(LinkedList<User> users) {
            UserDB.users=users;}
    public static boolean usernameExist(String username){
        for(User user : UserDB.getUsers()){
            if(user.getUserName().equals(username))
                return true;
        }

            return false;

    }
    }


