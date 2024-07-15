package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@[\\w-\\.]+\\.com$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final String NAME_REGEX = "^[a-zA-Z\\s]+$";
    private static final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);
    private static final String PHONE_REGEX = "^\\+?[0-9\\s-]{10,15}$";
    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);
    private static final String DOCUMENT_NUMBER_REGEX = "^[0-9]{6,10}$";
    private static final Pattern DOCUMENT_NUMBER_PATTERN = Pattern.compile(DOCUMENT_NUMBER_REGEX);

    public static boolean isValidPassword(String password) {
        if (password == null) {
            return false;
        }
        Matcher matcher = PASSWORD_PATTERN.matcher(password);
        return matcher.matches();
    }
    
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }

    public static String validateAndFormatName(String name) {
        if (name == null) {
            return null;
        }
        Matcher matcher = NAME_PATTERN.matcher(name);
        if (matcher.matches()) {
            return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
        return null;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if(phoneNumber.equals("")){
            return true;
        }
        if (phoneNumber == null) {
            return false;
        }
        Matcher matcher = PHONE_PATTERN.matcher(phoneNumber);
        return matcher.matches();
    }

    public static boolean isValidDocumentNumber(String documentNumber) {
        if (documentNumber == null) {
            return false;
        }
        Matcher matcher = DOCUMENT_NUMBER_PATTERN.matcher(documentNumber);
        return matcher.matches();
    }
}
