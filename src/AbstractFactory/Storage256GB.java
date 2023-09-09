package AbstractFactory;
//구상 Product
public class Storage256GB implements Storage{
    @Override
    public void howManyStorage() {
        System.out.println("256GB Storage");
    }
}
