package com.user.registraion;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationtest {


    private UserRegistration User;

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = User.validateFirstName("Mahesh");
        Assert.assertTrue(result);
    }


    @Test
    public void givenFirstName_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = User.validateFirstName("ma");
        Assert.assertFalse(result);

    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("Naik");
        Assert.assertTrue(result);


    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateLastName("naik");
        Assert.assertFalse(result);

    }


}

