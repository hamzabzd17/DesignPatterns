package com.SingelotonClass;

public class SingleTonObject {

    private static SingleTonObject instance = new SingleTonObject();

    private void SignleTonObject() {

    }

    public static SingleTonObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("this is singleton class");
    }

}
