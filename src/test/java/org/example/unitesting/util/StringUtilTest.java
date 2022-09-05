package org.example.unitesting.util;

import org.junit.Assert;
import org.junit.Test;

class StringUtilTest {

    @Test
    public void testRepeat() {

        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 1));
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }
}