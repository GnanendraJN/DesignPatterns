package org.learning.designpatterns.creational.simpleFactory;

public class CarFactory {

    public static Car getCar(String carType){
        Car car = null;
        if(carType.equalsIgnoreCase("TataNexon")){
            return new TataNexon();
        }else if(carType.equalsIgnoreCase("TataSafari")){
            return new TataSafari();
        }else {
            return null;
        }
    }
}
