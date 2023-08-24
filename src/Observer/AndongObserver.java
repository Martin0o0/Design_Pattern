package Observer;

public class AndongObserver implements Observer{
    @Override
    public void update(NowDateTime nowDateTime) {
        System.out.println("안동사람이 서울시계를 본다.:" + nowDateTime.getDateTime());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
