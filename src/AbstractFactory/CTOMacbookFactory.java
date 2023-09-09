package AbstractFactory;


//구상 Factory
public class CTOMacbookFactory implements MacbookFactory{
    @Override
    public CPU createCPU() {
        return new M2chip();
    }

    @Override
    public RAM createRAM() {
        return new Ram16GB();
    }

    @Override
    public Storage createStorage() {
        return new Storage512GB();
    }
}
