package AbstractFactory;

//구상 Product
public class M2chip implements CPU{

    @Override
    public void whichProcessor() {
        System.out.println("M2 Chip");
    }
}
