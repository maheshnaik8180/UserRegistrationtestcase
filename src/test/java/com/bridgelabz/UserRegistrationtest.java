package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationtest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration user = new UserRegistration();
        boolean result = user.validateFirstName("Mahesh");
        Assert.assertTrue(result);
    }




}
