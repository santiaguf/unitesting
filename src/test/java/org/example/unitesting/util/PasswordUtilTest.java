package org.example.unitesting.util;

import org.example.unitesting.util.PasswordUtil.SecurityLevel.*;

import org.junit.Assert;
import org.junit.Test;

import static org.example.unitesting.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_that_8_letters() {
        Assert.assertEquals(WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters() {
        Assert.assertEquals(WEAK, PasswordUtil.assessPassword("dfefghsSD"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        Assert.assertEquals(MEDIUM, PasswordUtil.assessPassword("dfef45ghs"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        Assert.assertEquals(STRONG, PasswordUtil.assessPassword("dfef45ghs!"));
    }


}