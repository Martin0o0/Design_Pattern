package Observer;

public class ObserverMain {

    public static void main(String[] args) {
        SeoulDateTime seoulDateTime = new SeoulDateTime();
        Observer observer1 = new AndongObserver();
        Observer observer2 = new JejuObserver();
        seoulDateTime.registerObserver(observer1);
        seoulDateTime.registerObserver(observer2);
        seoulDateTime.setDateTime();

    }

}
