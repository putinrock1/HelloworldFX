package model;

import com.sun.tools.corba.se.idl.constExpr.Equal;

import java.text.Format;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by surya on 7/5/16.
 */
public class Emailvalidator extends Throwable {
    private Pattern pattern;
    private Matcher matcher;

    private static final String Email_Format= "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$";

    public Emailvalidator() {
        pattern = Pattern.compile(Email_Format);
    }
        public boolean validate (final String hex){
            matcher= pattern.matcher(hex);
            return matcher.matches();

    }

    }

