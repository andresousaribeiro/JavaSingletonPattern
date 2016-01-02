package pt.andre.ribeiro.dev.singleton;

public class EagerInitializedSingleton {
    
private static final EagerInitialization instance = new EagerInitialization();

private EagerInitialization(){}

public static EagerInitialization getInstance(){
     return instance;
} 

}