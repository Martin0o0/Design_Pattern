package AbstractFactory;


//구상 Product
public class M1chip implements CPU{
    @Override
    public void whichProcessor() {
        System.out.println("M1 Chip");
    }
}
