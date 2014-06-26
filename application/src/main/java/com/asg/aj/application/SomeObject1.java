package com.asg.aj.application;

public class SomeObject1 {

    public void doSomething1() throws SomeException {
        System.out.println(getClass() + ": " + "doSomething1()");
    }

    public void doSomething2() throws SomeException {
        System.out.println(getClass() + ": " + "doSomething2()");
    }
}
