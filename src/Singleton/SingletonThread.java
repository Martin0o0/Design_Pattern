package Singleton;

public class SingletonThread extends Thread{
    MultiThreadingSingleton multiThreadingSingleton;
    @Override
    public void run() {
        multiThreadingSingleton = MultiThreadingSingleton.getInstance();
        System.out.println(multiThreadingSingleton.toString());

    }

    public MultiThreadingSingleton getMultiThreadingSingleton(){
        return this.multiThreadingSingleton;
    }

}
