package Singleton;

public class MultiThreadingSingleton {
    private static MultiThreadingSingleton multiThreadingSingleton = new MultiThreadingSingleton();
    //private 생성자 생성
    private MultiThreadingSingleton(){ }

    public static MultiThreadingSingleton getInstance(){
        return multiThreadingSingleton;
    }
}
