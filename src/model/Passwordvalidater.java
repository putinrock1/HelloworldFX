package model;

import javafx.scene.layout.GridPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

/**
 * Created by surya on 7/5/16.
 */
public class Passwordvalidater extends Throwable {
    private Pattern pattern;
    private Matcher matcher;

    private static final String PASSWORD_PATTERN =
            "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";

    public Passwordvalidater(){
        pattern = Pattern.compile(PASSWORD_PATTERN);
    }


    public boolean validate( String password) throws PasswordException{

        matcher = pattern.matcher(password);
        return matcher.matches();

    }

    private class PasswordException extends Exception {
    }
}
