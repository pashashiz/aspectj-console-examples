package com.asg.aj.application;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        SomeObject1 so1 = new SomeObject1();
        System.out.println("Class methods: " + Arrays.toString(so1.getClass().getDeclaredMethods()));
        try {
            so1.doSomething1();
        } catch (Throwable e) {
            System.out.println("Error: " + e);
        }
        try {
            so1.doSomething2();
        } catch (Throwable e) {
            System.out.println("Error: " + e);
        }
        SomeObject2 so2 = new SomeObject2();
        try {
            so2.doSomething1();
        } catch (Throwable e) {
            System.out.println("Error: " + e);
        }
        try {
            so2.doSomething2();
        } catch (Throwable e) {
            System.out.println("Error: " + e);
        }
    }

}
