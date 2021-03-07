package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    // Pattern Same for First & Last Name
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

}
