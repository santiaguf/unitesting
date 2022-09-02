package org.example.unitesting.util;

class StringUtilTest {
    public static void main(String[] args) {
        String result = StringUtil.repeat("hola", 3);
        System.out.println(result);

        if(!result.equals("holaholahola")){
            System.out.println("error");
        }

        String result2 = StringUtil.repeat("hola", 1);
        System.out.println(result);
        if(!result2.equals("hola")){
            System.out.println("error");
        }
    }
}