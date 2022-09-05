package org.example.unitesting.util;

class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        assertEquals(result, "holaholahola");

        String result2 = StringUtil.repeat("hola", 1);
        if(!result2.equals("hola")){
            throw new RuntimeException("error ");
        }
    }

    private static void assertEquals(String actual, String expected) {
        if(!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to " + expected);
        }
    }
}