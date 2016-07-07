package View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

/**
 * Created by surya on 7/4/16.
 */
public class SignupJavaFxView {


    public SignupJavaFxView() throws IOException{
        Stage signupStage = new Stage();
        Parent signupView = FXMLLoader.load(getClass().getResource("SignupFX.fxml"));
        signupStage.setTitle("Signup Page");

        signupStage.setScene(new Scene(signupView, 800, 600));
        signupStage.show();
    }


    public static Stage getSignupStage() {
        Stage stage = new Stage();
        return stage;
    }
}

