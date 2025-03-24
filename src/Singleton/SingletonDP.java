package Singleton;

public class SingletonDP {
    private String name;
    private String details;
    private int age;
    private SingletonDP(){

    }
    private static SingletonDP instance;
    /*
    step1 --> Make constructor private
    step2 --> Create a static method to create an instance
    step3 --> static method checks if instance already there
              if yes --> return instance
                 no --> create instance and return
     */
    public static SingletonDP createUser(){
        if(instance==null){
            instance = new SingletonDP();
        }
        return instance;
    }
}
