package com.journaldev.singleton;

public class EagerInitializedSingleton {
    
private static final EagerInitialization instance = new EagerInitialization();

private EagerInitialization(){}

public static EagerInitializedSingleton getInstance(){
     return instance;
} 

}