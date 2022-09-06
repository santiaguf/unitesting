package org.example.unitesting.util;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilTest {

    @Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", -1));
    }

    @Test
    public void word_is_not_empty(){
        Assert.assertFalse(StringUtil.isEmpty("Palabra"));
    }

    @Test
    public void quotationMarks_is_Empty(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void space_is_Empty(){
        String str = new String(" ");
        Assert.assertTrue(StringUtil.isEmpty(str));
    }

    @Test
    public void null_is_empty(){
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    /* available in Junit 5+
    @Test
    public void repeat_string_negative_times_assert_throw() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("hola", -1);
        });
    } */
}
