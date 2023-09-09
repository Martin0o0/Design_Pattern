package Command;

//Client
public class CommandMain {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        // ConcreteCommand 생성
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker 생성 및 ConcreteCommand 설정
        Controller remote = new Controller();
        remote.setCommand(lightOn);

        remote.execute();
        System.out.println("전등 상태: " + livingRoomLight.isOn());

        remote.Undo();
        System.out.println("전등 상태: " + livingRoomLight.isOn());

        remote.setCommand(lightOff);
        remote.execute();
        System.out.println("전등 상태: " + livingRoomLight.isOn());

        remote.Undo();
        System.out.println("전등 상태: " + livingRoomLight.isOn());


    }
}
