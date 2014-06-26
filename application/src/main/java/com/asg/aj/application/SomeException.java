package com.asg.aj.application;

public class SomeException extends Exception {

    public SomeException() {
        super();
    }

    public SomeException(String s) {
        super(s);
    }

    public SomeException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public SomeException(Throwable throwable) {
        super(throwable);
    }

    protected SomeException(String s, Throwable throwable, boolean b, boolean b2) {
        super(s, throwable, b, b2);
    }
}
