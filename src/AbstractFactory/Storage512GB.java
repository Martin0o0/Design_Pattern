package AbstractFactory;
//구상 Product
public class Storage512GB implements Storage{
    @Override
    public void howManyStorage() {
        System.out.println("512GB Storage");
    }
}
