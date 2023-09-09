package Command;


//Reciever 클래스
public class Light {

    private boolean isOn;

    public Light(){
        this.isOn = false;
    }

    void turnOn() {
        isOn = true;
        System.out.println("Light on");
    }

    void turnOff() {
        isOn = false;
        System.out.println("Light off");
    }

    boolean isOn() {
        return isOn;
    }
}
