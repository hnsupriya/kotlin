package com.healthcare.claims.service;

import kotlin.time.TestTimeSource;

public class TestSingletonFromJava {
    public static final double stateTax = 2.1;

    public String greetings(){

        return "Hi this is Supriya";
    }
    public static void main(){
        String result = UserProfile.INSTANCE.getUserDetails();
        System.out.println(result);
        TestSingletonFromJava obj = new TestSingletonFromJava();
        System.out.println(obj.greetings());
        System.out.println(stateTax);
        System.out.println(TestSingletonFromJava.stateTax);
    }
}
