package AbstractFactory;

//AbstractFactory
public interface MacbookFactory {
    CPU createCPU();
    RAM createRAM();
    Storage createStorage();
}
