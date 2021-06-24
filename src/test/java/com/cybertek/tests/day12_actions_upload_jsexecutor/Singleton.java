package com.cybertek.tests.day12_actions_upload_jsexecutor;

public class Singleton {


    private Singleton(){} // singleton means private constructor

    private static String word; // we create access only through our getter method

    public static String getWord() {

        if (word == null) {
            System.out.println("First time call. Word object is null.");
            word = "something";
        }else{
            System.out.println("Word already has a value");
        }
        return word;
    }
}
