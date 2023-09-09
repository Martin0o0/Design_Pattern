package Singleton;

public class MultiThreadSingleton {
    public static void main(String[] args) {

        SingletonThread singletonThread1 = new SingletonThread();

        SingletonThread singletonThread2 = new SingletonThread();
        singletonThread1.start();
        singletonThread2.start();

        try {
            singletonThread1.join();
            singletonThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 쓰레드 1과 쓰레드 2에서 생성한 인스턴스가 동일한지 확인
        MultiThreadingSingleton multiThreadingSingleton1 = singletonThread1.getMultiThreadingSingleton();
        MultiThreadingSingleton multiThreadingSingleton2 = singletonThread2.getMultiThreadingSingleton();
        System.out.println("쓰레드 1과 쓰레드 2에서 생성한 인스턴스는 같은가? " + (multiThreadingSingleton1 == multiThreadingSingleton2));
    }
}
