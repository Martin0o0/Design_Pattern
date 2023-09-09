package AbstractFactory;

//구상 Factory
public class BasicMacbookFactory implements MacbookFactory{
    @Override
    public CPU createCPU() {
        return new M1chip();
    }

    @Override
    public RAM createRAM() {
        return new Ram8GB();
    }

    @Override
    public Storage createStorage() {
        return new Storage256GB();
    }
}
