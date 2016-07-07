package View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import model.User;
import javafx.application.Application;
import java.io.IOException;
import java.util.LinkedList;
import model.UserIO;
import model.UserDB;
import javafx.fxml.LoadException;

/**
 * Created by surya on 7/5/16.
 */
public class LoginJavaFXView extends Application {
    @Override

  public void start(Stage primaryStage) throws Exception{
        loadUserDB();
        Parent loginView = FXMLLoader.load(getClass().getResource("LoginJavaFX.fxml"));
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(new Scene(loginView,300,275));
        primaryStage.show();
    }
     public void loadUserDB(){
         try{
             UserDB.setUsers((LinkedList<User>)UserIO.readUsers());
         } catch (IOException e){
             System.err.println("Fail to open/read userDB.dat file");

         } catch (ClassNotFoundException e){
             System.err.println("Fail reading and casting the UserDB due to User class issue ");
         }
     }
    public static void main (String[] args){ launch(args);}
}
