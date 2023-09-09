package AbstractFactory;
//구상 Product
public class Ram16GB implements RAM{
    @Override
    public void howManyMemory() {
        System.out.println("16GB Main Memory");
    }
}
