package Observer;

import java.util.ArrayList;
import java.util.List;

//subsect
public abstract class NowDateTime {
    private List<Observer> observers = new ArrayList<Observer>();        // Observer들을 보관
    public void registerObserver(Observer observer) {    // Observer를 추가
        observers.add(observer);
    }
    public void removeObserver(Observer observer) { // Observer를 삭제
        observers.remove(observer);
    }
    public void notifyObservers() {               // Observer에 통지
        for(Observer o : this.observers) {
            o.update(this);
        }
    }

    public abstract String getDateTime();
    public abstract  void setDateTime();


}
