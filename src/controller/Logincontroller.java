package controller;

import View.SignupJavaFxView;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.Event;
import java.io.IOException;
import model.UserDB;
/**
 * Created by surya on 7/4/16.
 */
public class Logincontroller {
    @FXML
    TextField uname;
    @FXML
    PasswordField pw;






    public void Authenticate (){
        for (int i=0; i< UserDB.getUsers().size(); i++){
            if(uname.getText().equals(UserDB.getUsers().get(i).getUserName())){
                System.out.println("Welcome" +  uname.getText());
            }
            else{
            System.out.println("Fail Authentication");
            }
        }
        }
    public void openSignupView() throws IOException {
                System.out.println("Open signup view");
               new SignupJavaFxView();
           }

}



