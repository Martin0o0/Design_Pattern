package AbstractFactory;
//구상 Product
public class Ram8GB implements RAM{
    @Override
    public void howManyMemory() {
        System.out.println("8GB Main Memory");
    }
}
