package controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import model.*;

import java.io.File;
import java.io.IOException;

import View.SignupJavaFxView;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.control.Label;



/**
 * Created by surya on 7/5/16.
 */
public class Signupcontroller {
    @FXML
    TextField uname;
    @FXML
    PasswordField pw;
    @FXML
    PasswordField confirmpw;
    @FXML
    TextField firstName;
    @FXML
    TextField LastName;
    @FXML
    TextField emailID;
    @FXML
    TextField phone;
    @FXML
    TextField DOB;
    @FXML
    TextField gender;
    @FXML
    Label inform;
    @FXML
    Label emailError;

    public void createAccount() {
        if (pw.getText().equals(confirmpw.getText())) {
            User user = new User(uname.getText(), pw.getText());
            UserDB.getUsers().add(user);

           /* inform.setText("Registration Complete!");
            inform.setTextFill(Color.web("#0000FF"));
            inform.setVisible(true);*/
        /*else {
            System.out.println("Password does not match");
        }

          */
            try {
                UserIO.writeUsers(UserDB.getUsers());
            } catch (IOException e) {
                System.err.println("Cannot write UserDB to binary file");
                e.printStackTrace();
            }
        }/*else{
            inform.setText("Password does not match");
            inform.setTextFill(Color.web("#FF0000"));
            inform.setVisible(true);
        }*/
        System.out.println(UserDB.getUsers());
    }

    public void createFileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Browse Picture");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
                new ExtensionFilter("All Files", "*.*"));
        File selectedFile = fileChooser.showOpenDialog(SignupJavaFxView.getSignupStage());
        System.out.println(selectedFile.getPath());

    }

    public void signUp() throws EmailException, PasswordException {

        Emailvalidator emV = new Emailvalidator();
        Passwordvalidater pwV = new Passwordvalidater();

    /*Validating email for its required format and letting user use only the unique email address*/
        for (int i = 0; i < UserDB.getUsers().size(); i++) {
            if (emailID.getText().equals(UserDB.getUsers().get(i).getUserName())) {
                emailError.setVisible(true);
                emailID.setId("button");
            }
        }
        if (emV.validate(emailID.getText())) {
            emailError.setVisible(false);
        } else {
            emailError.setVisible(true);
            emailID.setId("button");
        }

    }

}
   



