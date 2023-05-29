package org.learning.designpatterns.creational.factoryMethod;

public abstract class Message {

    public abstract String getContent();

    public String encrypt(String str){
        return str.toLowerCase();
    }

    public void addDefaultHeader(){

    }

}
