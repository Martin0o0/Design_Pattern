package Singleton;

public class MultiThreadSingleton {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> {
            MultiThreadingSingleton multiThreadingSingleton = MultiThreadingSingleton.getInstance();
        });


        Thread thread2 = new Thread(() -> {
            MultiThreadingSingleton multiThreadingSingleton = MultiThreadingSingleton.getInstance();
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 쓰레드 1과 쓰레드 2에서 생성한 인스턴스가 동일한지 확인
        MultiThreadingSingleton multiThreadingSingleton1 = MultiThreadingSingleton.getInstance();
        MultiThreadingSingleton multiThreadingSingleton2 = MultiThreadingSingleton.getInstance();

        System.out.println("쓰레드 1과 쓰레드 2에서 생성한 인스턴스는 같은가? " + (multiThreadingSingleton1 == multiThreadingSingleton2));
    }
}
